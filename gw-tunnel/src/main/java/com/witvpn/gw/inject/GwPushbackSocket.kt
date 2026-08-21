package com.witvpn.gw.inject

import java.io.IOException
import java.io.InputStream
import java.io.OutputStream
import java.net.Socket
import java.nio.ByteBuffer

/**
 * A [Socket] wrapper that can "push back" bytes we already read during the injector
 * handshake, so the SSH transport (sshj) later reads the full SSH banner from the
 * start. sshj calls getInputStream() once and reads from it; we prepend the pushed
 * bytes to that stream.
 *
 * Thread-safe for the single-reader pattern sshj uses.
 */
class GwPushbackSocket(private val delegate: Socket) : Socket() {

    @Volatile private var pushedBack: ByteArray? = null
    private val lock = Any()

    fun pushBack(bytes: ByteArray) {
        synchronized(lock) {
            pushedBack = bytes
        }
    }

    override fun getInputStream(): InputStream {
        val base = delegate.getInputStream()
        val pb = synchronized(lock) { pushedBack }
        return if (pb != null && pb.isNotEmpty()) PushbackStream(pb, base) else base
    }

    override fun getOutputStream(): OutputStream = delegate.getOutputStream()

    // delegate the rest
    override fun connect(endpoint: java.net.SocketAddress?) { delegate.connect(endpoint) }
    override fun connect(endpoint: java.net.SocketAddress?, timeout: Int) { delegate.connect(endpoint, timeout) }
    override fun bind(bindpoint: java.net.SocketAddress?) { delegate.bind(bindpoint) }
    override fun getRemoteSocketAddress(): java.net.SocketAddress? = delegate.remoteSocketAddress
    override fun getLocalSocketAddress(): java.net.SocketAddress? = delegate.localSocketAddress
    override fun getInetAddress(): java.net.InetAddress = delegate.inetAddress
    override fun getLocalAddress(): java.net.InetAddress = delegate.localAddress
    override fun getPort(): Int = delegate.port
    override fun getLocalPort(): Int = delegate.localPort
    override fun close() { delegate.close() }
    override fun isClosed(): Boolean = delegate.isClosed
    override fun isConnected(): Boolean = delegate.isConnected
    override fun isBound(): Boolean = delegate.isBound
    override fun getSoTimeout(): Int = delegate.soTimeout
    override fun setSoTimeout(timeout: Int) { delegate.soTimeout = timeout }
    override fun setTcpNoDelay(on: Boolean) { delegate.tcpNoDelay = on }
    override fun getTcpNoDelay(): Boolean = delegate.tcpNoDelay
    override fun setKeepAlive(on: Boolean) { delegate.keepAlive = on }
    override fun getKeepAlive(): Boolean = delegate.keepAlive
    override fun setSendBufferSize(size: Int) { delegate.sendBufferSize = size }
    override fun getSendBufferSize(): Int = delegate.sendBufferSize
    override fun setReceiveBufferSize(size: Int) { delegate.receiveBufferSize = size }
    override fun getReceiveBufferSize(): Int = delegate.receiveBufferSize
    override fun setSoLinger(on: Boolean, linger: Int) { delegate.setSoLinger(on, linger) }
    override fun getSoLinger(): Int = delegate.soLinger
    override fun setTrafficClass(tc: Int) { delegate.trafficClass = tc }
    override fun getTrafficClass(): Int = delegate.trafficClass

    /** InputStream that serves [prefix] first, then drains [tail]. */
    private class PushbackStream(private val prefix: ByteArray, private val tail: InputStream) : InputStream() {
        private val buf: ByteBuffer = ByteBuffer.wrap(prefix)
        private var tailDone = false
        override fun read(): Int {
            if (buf.hasRemaining()) return buf.get().toInt() and 0xFF
            return tail.read()
        }
        override fun read(b: ByteArray, off: Int, len: Int): Int {
            if (buf.hasRemaining()) {
                val n = minOf(len, buf.remaining())
                buf.get(b, off, n)
                return n
            }
            return tail.read(b, off, len)
        }
        override fun available(): Int = buf.remaining() + (tail.available())
        override fun close() { tail.close() }
    }
}
