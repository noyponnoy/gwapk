package com.witvpn.ikev2.presentation.ui.servers

import androidx.lifecycle.LiveData
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.witvpn.ikev2.domain.model.Server
import com.witvpn.ikev2.domain.model.User
import com.witvpn.ikev2.domain.repository.ServerRepository
import com.witvpn.ikev2.presentation.base.BaseViewModel
import com.witvpn.gw.model.GwServerConfig
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ServersViewModel @Inject constructor(
    private val serverRepository: ServerRepository,
) : BaseViewModel() {

    val serversList: LiveData<List<Server>> = serverRepository.stateFlow.asLiveData()
    val serversAwgList: LiveData<List<com.witvpn.ikev2.domain.model.ServerAwg>> = serverRepository.awgStateFlow.asLiveData()
    val serversGwList: LiveData<List<Server>> = serverRepository.gwServersStateFlow.asLiveData()
    val serversGwConfigMap: LiveData<Map<String, GwServerConfig>> = serverRepository.gwConfigMapFlow.asLiveData()
    val serversLoadMap: LiveData<Map<String, Int>> = serverRepository.serversLoadFlow.asLiveData()

    fun execute(user: User) {
        viewModelScope.launch(exceptionHandler) {
            val param = mutableMapOf("userId" to user.id as Any)
            serverRepository.getServers(param)
            serverRepository.getServersAwg(param)
        }
        fetchLoad()
    }

    fun fetchGwServers(user: User, privHex: String) {
        viewModelScope.launch(exceptionHandler) {
            val param = mutableMapOf("userId" to user.id as Any)
            serverRepository.getServersGw(param, privHex)
        }
    }

    fun fetchLoad() {
        viewModelScope.launch(exceptionHandler) {
            serverRepository.fetchServersLoad()
        }
    }
}