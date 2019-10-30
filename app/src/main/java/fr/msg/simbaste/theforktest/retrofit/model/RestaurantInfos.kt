package fr.msg.simbaste.theforktest.retrofit.model


import com.google.gson.annotations.SerializedName

data class RestaurantInfos(
    @SerializedName("data")
    val `data`: Data,
    @SerializedName("result")
    val result: Int,
    @SerializedName("result_cached")
    val resultCached: Any,
    @SerializedName("result_code")
    val resultCode: Any,
    @SerializedName("result_detail")
    val resultDetail: String,
    @SerializedName("result_msg")
    val resultMsg: String,
    @SerializedName("sync")
    val sync: List<Any>
)