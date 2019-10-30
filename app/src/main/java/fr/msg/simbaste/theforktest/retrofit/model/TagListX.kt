package fr.msg.simbaste.theforktest.retrofit.model


import com.google.gson.annotations.SerializedName

data class TagListX(
    @SerializedName("tag_list_2")
    val tagList2: TagList2,
    @SerializedName("tag_list_381")
    val tagList381: TagList381
)