package fr.msg.simbaste.theforktest.retrofit.model


import com.google.gson.annotations.SerializedName

data class PicsMain(
    @SerializedName("160x120")
    val x120: String,
    @SerializedName("240x135")
    val x135: String,
    @SerializedName("184x184")
    val x184: String,
    @SerializedName("480x270")
    val x270: String,
    @SerializedName("612x344")
    val x344: String,
    @SerializedName("664x374")
    val x374: String,
    @SerializedName("80x60")
    val x60: String,
    @SerializedName("1350x759")
    val x759: String,
    @SerializedName("92x92")
    val x92: String
)