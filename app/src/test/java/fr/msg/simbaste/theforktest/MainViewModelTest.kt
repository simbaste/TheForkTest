package fr.msg.simbaste.theforktest

import fr.msg.simbaste.theforktest.retrofit.model.RestaurantInfos
import org.junit.Before
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import org.mockito.Mock
import org.mockito.MockitoAnnotations

@RunWith(JUnit4::class)
class MainViewModelTest {

    @Mock
    lateinit var restaurantInfos: RestaurantInfos

    lateinit var mainActivityViewModel: MainActivityViewModel

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
    }
}