package com.witvpn.ikev2.data.repository

import com.witvpn.ikev2.data.remote.ApiService
import com.witvpn.ikev2.data.remote.model.ServerObject
import com.witvpn.ikev2.domain.model.Server
import com.witvpn.ikev2.domain.repository.ServerRepository
import com.witvpn.gw.crypto.GwCrypto
import com.witvpn.gw.model.GwEnvelope
import com.witvpn.gw.model.GwServerConfig
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ServerRepositoryImpl @Inject constructor(
    private val api: ApiService
) : ServerRepository {
    private val state = MutableStateFlow<List<Server>>(listOf())
    override val stateFlow: StateFlow<List<Server>> =
        state.asStateFlow()
        
    private val awgState = MutableStateFlow<List<com.witvpn.ikev2.domain.model.ServerAwg>>(listOf())
    override val awgStateFlow: StateFlow<List<com.witvpn.ikev2.domain.model.ServerAwg>> = awgState.asStateFlow()

    private val gwState = MutableStateFlow<List<Server>>(listOf())
    override val gwServersStateFlow: StateFlow<List<Server>> = gwState.asStateFlow()

    private val gwConfigMap = MutableStateFlow<Map<String, GwServerConfig>>(emptyMap())
    override val gwConfigMapFlow: StateFlow<Map<String, GwServerConfig>> = gwConfigMap.asStateFlow()

    override suspend fun getServersAwg(param: MutableMap<String, Any>) {
        try {
            val response = api.getServersAwg(param)
            val servers = response.data?.map { dto ->
                com.witvpn.ikev2.domain.model.ServerAwg(
                    ipAddress = dto.ipAddress ?: "",
                    country = dto.country ?: "",
                    state = dto.state ?: "",
                    countryCode = dto.countryCode ?: "",
                    premium = dto.premium ?: false,
                    config = dto.config ?: "",
                    status = dto.status ?: false,
                    priority = dto.priority ?: 0,
                    recommend = dto.recommend ?: false
                )
            } ?: emptyList()
            awgState.update { servers }
        } catch (e: Exception) {
            android.util.Log.e("AWGServerRepository", "getServersAwg EXCEPTION: ${e.message}", e)
        }
    }

    override suspend fun getServersGw(param: MutableMap<String, Any>, privHex: String) {
        try {
            val response = api.getServersGw(param)
            val configMap = mutableMapOf<String, GwServerConfig>()
            val servers = response.data?.mapNotNull { row ->
                val env = row.enc ?: return@mapNotNull null
                val meta = row.meta
                try {
                    val cfg = GwCrypto.decryptConfig(
                        privHex,
                        GwEnvelope(
                            eph = env.eph ?: "",
                            ct = env.ct ?: "",
                            iv = env.iv ?: ""
                        )
                    )
                    val serverId = "gw_${cfg.ip_address}"
                    configMap[serverId] = cfg
                    Server(
                        id = serverId,
                        country = meta?.country ?: cfg.proxy_host,
                        ipAddress = cfg.ip_address,
                        premium = meta?.premium ?: false,
                        recommend = meta?.priority?.let { it > 0 } ?: false,
                        state = meta?.country ?: cfg.proxy_host,
                        countryCode = meta?.countryCode,
                        ca_file = null,
                        ca_fileName = null,
                        p_nsm = null,
                        u_nsm = null,
                        protocol = "gw",
                        configAwg = null
                    )
                } catch (e: Exception) {
                    android.util.Log.e("GWServerRepository", "Decrypt failed: ${e.message}", e)
                    null
                }
            } ?: emptyList()
            gwConfigMap.update { configMap }
            gwState.update { servers }
        } catch (e: Exception) {
            android.util.Log.e("GWServerRepository", "getServersGw EXCEPTION: ${e.message}", e)
        }
    }

    private val _serversLoad = MutableStateFlow<Map<String, Int>>(emptyMap())
    override val serversLoadFlow: StateFlow<Map<String, Int>> = _serversLoad.asStateFlow()

    override suspend fun getServers(param: MutableMap<String, Any>) {
        val response = api.getServers(param)
        val servers = response.data.map { unwrap(it) }
        state.update { servers }
        fetchServersLoad()
    }
    
    override suspend fun fetchServersLoad() {
        try {
            val response = api.getServersLoad(mutableMapOf())
            if (response.isSuccessful && response.body()?.success == 1) {
                val data = response.body()?.data ?: emptyMap()
                android.util.Log.d("VlessLoad", "fetchServersLoad SUCCESS. Size: ${data.size}, keys: ${data.keys}")
                _serversLoad.update { data }
            } else {
                android.util.Log.e("VlessLoad", "fetchServersLoad FAILED. code=${response.code()}, errorBody=${response.errorBody()?.string()}")
            }
        } catch (e: Exception) {
            android.util.Log.e("VlessLoad", "fetchServersLoad EXCEPTION: ${e.message}", e)
        }
    }

    private fun unwrap(serverObject: ServerObject): Server {
        return Server(
            id = serverObject.id,
            country = serverObject.country,
            ipAddress = serverObject.ipAddress,
            premium = serverObject.premium as? Boolean,
            recommend = serverObject.recommend as? Boolean,
            state = serverObject.state,
            countryCode = serverObject.countryCode,
            ca_file = serverObject.caFile,
            ca_fileName = serverObject.caFileName,
            p_nsm = serverObject.p_nsm,
            u_nsm = serverObject.u_nsm
        )
    }
}