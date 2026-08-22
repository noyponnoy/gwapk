package com.witvpn.ikev2.domain.repository

import com.witvpn.ikev2.domain.model.Server
import com.witvpn.gw.model.GwServerConfig
import kotlinx.coroutines.flow.StateFlow

interface ServerRepository {
    val stateFlow : StateFlow<List<Server>>
    val serversLoadFlow : StateFlow<Map<String, Int>>
    val awgStateFlow : StateFlow<List<com.witvpn.ikev2.domain.model.ServerAwg>>
    val gwServersStateFlow : StateFlow<List<Server>>
    val gwConfigMapFlow : StateFlow<Map<String, GwServerConfig>>
    suspend fun getServers(param: MutableMap<String, Any>)
    suspend fun getServersAwg(param: MutableMap<String, Any>)
    suspend fun getServersGw(param: MutableMap<String, Any>, privHex: String)
    suspend fun fetchServersLoad()
}