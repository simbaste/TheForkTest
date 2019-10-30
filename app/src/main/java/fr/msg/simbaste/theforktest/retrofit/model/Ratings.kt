package fr.msg.simbaste.theforktest.retrofit.model


import com.google.gson.annotations.SerializedName

data class Ratings(
    @SerializedName("ambience_rate")
    val ambienceRate: Int,
    @SerializedName("food_rate")
    val foodRate: Int,
    @SerializedName("global_rate")
    val globalRate: Int,
    @SerializedName("noice_rate")
    val noiceRate: Int,
    @SerializedName("price_rate")
    val priceRate: Int,
    @SerializedName("service_rate")
    val serviceRate: Int,
    @SerializedName("waiting_rate")
    val waitingRate: Int
)