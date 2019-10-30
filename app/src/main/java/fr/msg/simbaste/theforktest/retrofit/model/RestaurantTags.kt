package fr.msg.simbaste.theforktest.retrofit.model


import com.google.gson.annotations.SerializedName

data class RestaurantTags(
    @SerializedName("restaurant_tags_10")
    val restaurantTags10: RestaurantTags10,
    @SerializedName("restaurant_tags_11")
    val restaurantTags11: RestaurantTags11,
    @SerializedName("restaurant_tags_12")
    val restaurantTags12: RestaurantTags12,
    @SerializedName("restaurant_tags_14")
    val restaurantTags14: RestaurantTags14,
    @SerializedName("restaurant_tags_19")
    val restaurantTags19: RestaurantTags19,
    @SerializedName("restaurant_tags_20")
    val restaurantTags20: RestaurantTags20,
    @SerializedName("restaurant_tags_4")
    val restaurantTags4: RestaurantTags4,
    @SerializedName("restaurant_tags_5")
    val restaurantTags5: RestaurantTags5,
    @SerializedName("restaurant_tags_8")
    val restaurantTags8: RestaurantTags8
)