package fr.msg.simbaste.theforktest

import fr.msg.simbaste.theforktest.retrofit.RestaurantInfosService
import fr.msg.simbaste.theforktest.retrofit.RetrofitInstance
import fr.msg.simbaste.theforktest.retrofit.model.RestaurantInfos
import retrofit2.Response

class RestaurantInfosRepository {

    var restaurantInfosService: RestaurantInfosService = RetrofitInstance.restaurantInfosService

    suspend fun getRestaurantInfosService(restaurantId: Int): Response<RestaurantInfos> = restaurantInfosService.getRestaurantInfos(restaurantId)

}