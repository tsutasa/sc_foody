package com.nqt.fooddy.activity

import android.content.Intent
import android.os.Bundle
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import com.nqt.fooddy.R
import com.synnapps.carouselview.ImageListener
import kotlinx.android.synthetic.main.activity_details.*


class DetailsActivity : AppCompatActivity() {


    var sampleImages = intArrayOf(
        R.drawable.dau_da_lat,
        R.drawable.vai_thieucopy,
        R.drawable.orange_from_gardencopy,
        R.drawable.orange_from_gardencopy
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN)
        carouselView.setPageCount(sampleImages.size)
        carouselView.setImageListener(imageListener)
        btnBack.setOnClickListener {
            onBackPressed()
        }
        btnAdd.setOnClickListener {
            val i = Intent(this,HomeActivity::class.java)
            i.putExtra("shop","shop")
            startActivity(i)
        }

    }
    var imageListener =
        ImageListener { position, imageView -> imageView.setImageResource(sampleImages[position]) }

}