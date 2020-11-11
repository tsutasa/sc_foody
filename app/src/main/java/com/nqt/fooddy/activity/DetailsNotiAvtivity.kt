package com.nqt.fooddy.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import com.nqt.fooddy.R
import kotlinx.android.synthetic.main.activity_details_noti_avtivity.*

class DetailsNotiAvtivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details_noti_avtivity)
        window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN)
        btnBack.setOnClickListener {
            onBackPressed()
        }
    }
}