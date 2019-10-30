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
import fr.msg.simbaste.theforktest.retrofit.model.PicsDiaporama
import fr.msg.simbaste.theforktest.retrofit.model.RestaurantInfos
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var viewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayShowTitleEnabled(false)

        viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)
        getRestaurantInfosResponse(16409)
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
        progress_bar.visibility = View.VISIBLE
        viewModel.getRestaurantInfosResponse(restaurantId).observe(this, Observer {
            progress_bar.visibility = View.GONE
            if (it.isSuccessful) {
                var restaurantInfos = it.body()

                Log.i(MainActivity::class.java.name, "restaurantInfos ==> ${restaurantInfos}")

                setupPageView(restaurantInfos?.data?.picsDiaporama?: listOf<PicsDiaporama>())
                setCardsMenu(restaurantInfos)
                setRestoInfos(restaurantInfos)
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

    private fun setCardsMenu(restaurantInfos: RestaurantInfos?) {
        menu1_textView.text = restaurantInfos?.data?.cardMain1
        menu2_textView.text = restaurantInfos?.data?.cardMain2
        menu3_textView.text = restaurantInfos?.data?.cardMain3

        restaurantInfos?.data?.priceCardMain1?.let {
            menu1_price_textView.text = getString(R.string.price_label, it)
        }
        restaurantInfos?.data?.priceCardMain2?.let {
            menu2_price_textView.text = getString(R.string.price_label, it)
        }
        restaurantInfos?.data?.priceCardMain3?.let {
            menu3_price_textView.text = getString(R.string.price_label, it)
        }
    }

    private fun setRestoInfos(restaurantInfos: RestaurantInfos?) {
        restaurant_name_textView.text = restaurantInfos?.data?.name
        rate_textView.text = restaurantInfos?.data?.avgRate?.toString()
        avg_price_textView.text = restaurantInfos?.data?.cardPrice?.toString()
        rate_number_textView.text = restaurantInfos?.data?.rateCount?.toString()
    }
}
