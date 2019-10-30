package fr.msg.simbaste.theforktest.retrofit

import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {

    val restaurantInfosService by lazy {
        Retrofit.Builder()
            .baseUrl("https://api.lafourchette.com")
            .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
            .build().create(RestaurantInfosService::class.java)
    }

}