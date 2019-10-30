package fr.msg.simbaste.theforktest.adapter

import android.content.Context
import android.graphics.Bitmap
import android.graphics.drawable.Drawable
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.viewpager.widget.PagerAdapter
import com.squareup.picasso.Picasso
import fr.msg.simbaste.theforktest.R
import fr.msg.simbaste.theforktest.retrofit.model.PicsDiaporama
import kotlinx.android.synthetic.main.photo_item_layout.view.*

class PhotosAdapter(private val receivedContext: Context, private val photosURLS: List<PicsDiaporama>): PagerAdapter() {

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val photoUrl = photosURLS.get(position).x759

        val view = View.inflate(receivedContext, R.layout.photo_item_layout, null)

        Picasso.get().load(photoUrl).centerCrop()
            .resize(view.measuredWidth, receivedContext.resources.getDimensionPixelSize(R.dimen.photo_default_height))
            .placeholder(R.drawable.placeholder).into(object:
            com.squareup.picasso.Target {
            override fun onBitmapFailed(e: java.lang.Exception?, errorDrawable: Drawable?) {
                view.photoImgview.setImageResource(R.drawable.placeholder)
            }

            override fun onBitmapLoaded(bitmap: Bitmap, from: Picasso.LoadedFrom) {
                view.photoImgview.setImageBitmap(bitmap)
                view.photoImgview.scaleType = ImageView.ScaleType.CENTER_CROP
            }

            override fun onPrepareLoad(placeHolderDrawable: Drawable?) {}
        })

        container.addView(view, 0)
        return view
    }

    override fun getCount(): Int {
        return photosURLS.count()
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        return container.removeView(`object` as View)
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`
    }

}