package com.witvpn.ikev2.data.remote.model

import com.google.gson.annotations.SerializedName

data class ServersGwResponse(
    @SerializedName("success") val success: Int?,
    @SerializedName("error") val error: Int?,
    @SerializedName("message") val message: String?,
    @SerializedName("data") val data: List<ServerGwRow>?
)

data class ServerGwRow(
    @SerializedName("meta") val meta: GwMeta?,
    @SerializedName("enc") val enc: GwEncEnvelope?
)

data class GwMeta(
    @SerializedName("country") val country: String?,
    @SerializedName("country_code") val countryCode: String?,
    @SerializedName("city") val city: String?,
    @SerializedName("priority") val priority: Int?,
    @SerializedName("premium") val premium: Boolean?,
    @SerializedName("enabled") val enabled: Boolean?
)

data class GwEncEnvelope(
    @SerializedName("eph") val eph: String?,
    @SerializedName("ct") val ct: String?,
    @SerializedName("iv") val iv: String?
)
