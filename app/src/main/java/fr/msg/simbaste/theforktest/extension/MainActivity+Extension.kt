package fr.msg.simbaste.theforktest.extension

import fr.msg.simbaste.theforktest.R
import fr.msg.simbaste.theforktest.retrofit.model.RestaurantInfos
import kotlinx.android.synthetic.main.resto_infos_layout.*
import kotlinx.android.synthetic.main.resto_menu_infos_layout.*
import kotlinx.android.synthetic.main.resto_rate_layout.*
import fr.msg.simbaste.theforktest.MainActivity
import kotlinx.android.synthetic.main.global_rate_layout.*

fun MainActivity.setCardsMenu(restaurantInfos: RestaurantInfos?) {
    this.menu1_textView.text = restaurantInfos?.data?.cardMain1
    this.menu2_textView.text = restaurantInfos?.data?.cardMain2
    this.menu3_textView.text = restaurantInfos?.data?.cardMain3

    restaurantInfos?.data?.priceCardMain1?.let {
        this.menu1_price_textView.text = getString(R.string.price_label, it)
    }
    restaurantInfos?.data?.priceCardMain2?.let {
        this.menu2_price_textView.text = getString(R.string.price_label, it)
    }
    restaurantInfos?.data?.priceCardMain3?.let {
        this.menu3_price_textView.text = getString(R.string.price_label, it)
    }
}

fun MainActivity.setRestoInfos(restaurantInfos: RestaurantInfos?) {
    this.restaurant_name_textView.text = restaurantInfos?.data?.name
    this.rate_textView.text = restaurantInfos?.data?.avgRate?.toString()

    restaurantInfos?.data?.cardPrice?.let {
        this.avg_price_textView.text = getString(R.string.avg_price_label, it)
    }

    restaurantInfos?.data?.rateCount?.let {
        this.rate_number_textView.text = getString(R.string.rate_count_label, it)
    }
}

fun MainActivity.setReviewsAndRates(restaurantInfos: RestaurantInfos?) {
    this.rate_avg_textView.text = restaurantInfos?.data?.tripAdvisorAvgRating.toString()
    restaurantInfos?.data?.tripAdvisorReviewCount?.let {
        this.review_count_textView.text = getString(R.string.total_review_label, it)
    }

    restaurantInfos?.data?.tripAdvisorReviewCount?.let {
        this.global_review_count_textView.text = getString(R.string.rate_count_label, it)
    }
}