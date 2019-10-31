package fr.msg.simbaste.theforktest.retrofit

import fr.msg.simbaste.theforktest.constants.Constants
import fr.msg.simbaste.theforktest.retrofit.model.RestaurantInfos
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface RestaurantInfosService {

    @GET("/api")
    suspend fun getRestaurantInfos(
        @Query(value = "id_restaurant") id_restaurant: Int,
        @Query(value = "key") key: String = Constants.apiKey,
        @Query(value = "method") method: String = Constants.apiMethod
    ): Response<RestaurantInfos>

}