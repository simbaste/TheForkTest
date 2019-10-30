package fr.msg.simbaste.theforktest.retrofit.model


import com.google.gson.annotations.SerializedName

data class TagList316(
    @SerializedName("banner_web")
    val bannerWeb: String,
    @SerializedName("display_order")
    val displayOrder: Any,
    @SerializedName("id_city_indexable")
    val idCityIndexable: Any,
    @SerializedName("id_restaurant_tag")
    val idRestaurantTag: Int,
    @SerializedName("id_restaurant_tag_category")
    val idRestaurantTagCategory: Int,
    @SerializedName("id_restaurant_tag_level_1")
    val idRestaurantTagLevel1: Any,
    @SerializedName("id_restaurant_tag_level_2")
    val idRestaurantTagLevel2: Any,
    @SerializedName("id_restaurant_tag_substitute")
    val idRestaurantTagSubstitute: Any,
    @SerializedName("indexable")
    val indexable: Int,
    @SerializedName("is_deleted")
    val isDeleted: Int,
    @SerializedName("is_displayed_search")
    val isDisplayedSearch: Boolean,
    @SerializedName("is_published_portal")
    val isPublishedPortal: Boolean,
    @SerializedName("marketing_banner")
    val marketingBanner: String,
    @SerializedName("marketing_description")
    val marketingDescription: Any,
    @SerializedName("marketing_title")
    val marketingTitle: Any,
    @SerializedName("pic_large")
    val picLarge: String,
    @SerializedName("pic_mobile")
    val picMobile: String,
    @SerializedName("pic_small")
    val picSmall: String,
    @SerializedName("search_volume")
    val searchVolume: Any,
    @SerializedName("seo_desc")
    val seoDesc: Any,
    @SerializedName("seo_h1")
    val seoH1: Any,
    @SerializedName("seo_title")
    val seoTitle: Any,
    @SerializedName("slug_indexable")
    val slugIndexable: String,
    @SerializedName("slug_list")
    val slugList: List<Any>,
    @SerializedName("tag_description")
    val tagDescription: String,
    @SerializedName("tag_name")
    val tagName: String,
    @SerializedName("title")
    val title: Any
)