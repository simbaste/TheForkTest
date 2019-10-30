package fr.msg.simbaste.theforktest

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import fr.msg.simbaste.theforktest.retrofit.model.RestaurantInfos
import retrofit2.Response

class MainActivityViewModel: ViewModel() {

    val restaurantInfosRepository = RestaurantInfosRepository()

    fun getRestaurantInfosResponse(restaurantId: Int): LiveData<Response<RestaurantInfos>> =
        liveData {
            val receivedRestaurantInfosResponse: Response<RestaurantInfos> = restaurantInfosRepository
                .getRestaurantInfosService(restaurantId)
            emit(receivedRestaurantInfosResponse)
        }
}