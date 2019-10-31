package fr.msg.simbaste.theforktest.retrofit.model


import com.google.gson.annotations.SerializedName

data class RestaurantTags(
    @SerializedName("category_name")
    val categoryName: String,
    @SerializedName("category_pic")
    val categoryPic: String,
    @SerializedName("id_restaurant_tag_category")
    val idRestaurantTagCategory: Int,
    @SerializedName("tag_list")
    val tagListMap: Map<String, TagList>
)