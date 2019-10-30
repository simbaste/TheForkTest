package fr.msg.simbaste.theforktest.retrofit.model


import com.google.gson.annotations.SerializedName

data class PicsDiaporama(
    @SerializedName("label")
    val label: String,
    @SerializedName("240x135")
    val x135: String,
    @SerializedName("480x270")
    val x270: String,
    @SerializedName("612x344")
    val x344: String,
    @SerializedName("664x374")
    val x374: String,
    @SerializedName("1350x759")
    val x759: String
)