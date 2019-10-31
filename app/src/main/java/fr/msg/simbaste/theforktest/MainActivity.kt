package fr.msg.simbaste.theforktest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.viewpager.widget.ViewPager
import fr.msg.simbaste.theforktest.adapter.PhotosAdapter
import fr.msg.simbaste.theforktest.constants.Constants
import fr.msg.simbaste.theforktest.extension.*
import fr.msg.simbaste.theforktest.retrofit.model.PicsDiaporama
import fr.msg.simbaste.theforktest.retrofit.model.RestaurantInfos
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.main_content_layout.*
import kotlinx.android.synthetic.main.resto_infos_layout.*
import kotlinx.android.synthetic.main.resto_infos_layout.rate_textView
import kotlinx.android.synthetic.main.resto_menu_infos_layout.*
import kotlinx.android.synthetic.main.resto_rate_layout.*

class MainActivity : AppCompatActivity() {

    lateinit var viewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayShowTitleEnabled(false)

        viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)
        getRestaurantInfosResponse(Constants.restaurantId)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean = when(item.itemId) {

        R.id.item_like -> {
            //put some code here
            true
        }
        R.id.item_search -> {
            //put some code here
            true
        }
        else -> { super.onOptionsItemSelected(item) }
    }

    private fun getRestaurantInfosResponse(restaurantId: Int) {
        progress_bar.makeVisible()
        viewModel.getRestaurantInfosResponse(restaurantId).observe(this, Observer {
            progress_bar.makeGone()
            if (it.isSuccessful) {
                var restaurantInfos = it.body()

                Log.i(MainActivity::class.java.name, "restaurantInfos ==> ${restaurantInfos}")

                setupPageView(restaurantInfos?.data?.picsDiaporama?: listOf())
                setCardsMenu(restaurantInfos)
                setRestoInfos(restaurantInfos)
                setReviewsAndRates(restaurantInfos)
            }
        })
    }

    private fun setupPageView(photosURLS: List<PicsDiaporama>) {
        photosViewPager.adapter = PhotosAdapter(
            this,
            photosURLS
        )
        tabLayout.setupWithViewPager(photosViewPager, true)
        photosViewPager.addOnPageChangeListener(object: ViewPager.OnPageChangeListener {

            override fun onPageScrollStateChanged(state: Int) { }

            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) { }

            override fun onPageSelected(position: Int) {
                diaporama_textView.text = photosURLS.get(position).label
            }
        })
    }
}
