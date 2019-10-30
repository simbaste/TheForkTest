package fr.msg.simbaste.theforktest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var viewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayShowTitleEnabled(false)

        viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)
        getRestaurantInfosResponse(6861)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    private fun getRestaurantInfosResponse(restaurantId: Int) {
        viewModel.getRestaurantInfosResponse(restaurantId).observe(this, Observer {
            if (it.isSuccessful) {
                var restaurantInfos = it.body()

                Log.i(MainActivity::class.java.name, "restaurantInfos ==> ${restaurantInfos}")
            }
        })
    }
}
