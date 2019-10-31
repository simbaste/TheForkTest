package fr.msg.simbaste.theforktest.retrofit.model


import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("address")
    val address: String,
    @SerializedName("avg_rate")
    val avgRate: Double,
    @SerializedName("avg_rate_evolution")
    val avgRateEvolution: String,
    @SerializedName("card_dessert_1")
    val cardDessert1: String,
    @SerializedName("card_dessert_2")
    val cardDessert2: String,
    @SerializedName("card_dessert_3")
    val cardDessert3: String,
    @SerializedName("price_card_main_1")
    val priceCardMain1: Double?,
    @SerializedName("price_card_main_2")
    val priceCardMain2: Double?,
    @SerializedName("price_card_main_3")
    val priceCardMain3: Double?,
    @SerializedName("card_main_1")
    val cardMain1: String,
    @SerializedName("card_main_2")
    val cardMain2: String,
    @SerializedName("card_main_3")
    val cardMain3: String,
    @SerializedName("card_price")
    val cardPrice: Int,
    @SerializedName("card_start_1")
    val cardStart1: String,
    @SerializedName("card_start_2")
    val cardStart2: String,
    @SerializedName("card_start_3")
    val cardStart3: String,
    @SerializedName("chef_name")
    val chefName: Any,
    @SerializedName("city")
    val city: String,
    @SerializedName("country")
    val country: String,
    @SerializedName("currency_code")
    val currencyCode: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("email")
    val email: String,
    @SerializedName("gps_lat")
    val gpsLat: Double,
    @SerializedName("gps_long")
    val gpsLong: Double,
    @SerializedName("has_stock")
    val hasStock: Int,
    @SerializedName("hour_open")
    val hourOpen: String,
    @SerializedName("id_city")
    val idCity: Int,
    @SerializedName("id_city_zipcode")
    val idCityZipcode: Int,
    @SerializedName("id_country")
    val idCountry: Int,
    @SerializedName("id_restaurant")
    val idRestaurant: Int,
    @SerializedName("id_restaurant_tag_speciality")
    val idRestaurantTagSpeciality: Int,
    @SerializedName("id_restaurant_tag_speciality_category")
    val idRestaurantTagSpecialityCategory: Int,
    @SerializedName("id_sale_type_normal")
    val idSaleTypeNormal: Int,
    @SerializedName("insider_description")
    val insiderDescription: Any,
    @SerializedName("insider_tips")
    val insiderTips: Any,
    @SerializedName("is_lf_test_restaurant")
    val isLfTestRestaurant: Int,
    @SerializedName("is_opened")
    val isOpened: Int,
    @SerializedName("is_phone_displayed")
    val isPhoneDisplayed: Int,
    @SerializedName("is_published_affiliate")
    val isPublishedAffiliate: Int,
    @SerializedName("is_published_portal")
    val isPublishedPortal: Int,
    @SerializedName("locale_code")
    val localeCode: String,
    @SerializedName("menus")
    val menus: Menus,
    @SerializedName("min_price")
    val minPrice: Int,
    @SerializedName("min_price_before")
    val minPriceBefore: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("nb_max_group")
    val nbMaxGroup: Int,
    @SerializedName("other_localization_infos")
    val otherLocalizationInfos: String,
    @SerializedName("parking")
    val parking: Any,
    @SerializedName("phone")
    val phone: String,
    @SerializedName("pics_diaporama")
    val picsDiaporama: List<PicsDiaporama>,
    @SerializedName("pics_main")
    val picsMain: PicsMain,
    @SerializedName("portal_url")
    val portalUrl: String,
    @SerializedName("price_bottle_of_mineral_water")
    val priceBottleOfMineralWater: Int,
    @SerializedName("price_bottle_of_wine_max")
    val priceBottleOfWineMax: Int,
    @SerializedName("price_bottle_of_wine_min")
    val priceBottleOfWineMin: Int,
    @SerializedName("price_half_bottle_of_mineral_water")
    val priceHalfBottleOfMineralWater: Int,
    @SerializedName("price_of_coffee")
    val priceOfCoffee: Int,
    @SerializedName("public_phone")
    val publicPhone: String,
    @SerializedName("rate_count")
    val rateCount: Int,
    @SerializedName("rate_distinction")
    val rateDistinction: String,
    @SerializedName("ratings")
    val ratings: Ratings,
    @SerializedName("restaurant_tags")
    val restaurantTagsMap: Map<String, RestaurantTags>,
    @SerializedName("restaurant_uuid")
    val restaurantUuid: String,
    @SerializedName("speciality")
    val speciality: String,
    @SerializedName("transport")
    val transport: String,
    @SerializedName("trip_advisor_avg_rating")
    val tripAdvisorAvgRating: Int,
    @SerializedName("trip_advisor_review_count")
    val tripAdvisorReviewCount: Int,
    @SerializedName("vacation")
    val vacation: Any,
    @SerializedName("web_max_days")
    val webMaxDays: Int,
    @SerializedName("zipcode")
    val zipcode: String
)