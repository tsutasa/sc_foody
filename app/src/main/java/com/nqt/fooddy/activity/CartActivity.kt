package com.nqt.fooddy.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Toast
import com.nqt.fooddy.R
import kotlinx.android.synthetic.main.activity_cart.*

class CartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)
        window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN)
        btnBack.setOnClickListener { onBackPressed() }
        btnBuy.setOnClickListener { Toast.makeText(this,"Bạn đã đặt hàng thành công",Toast.LENGTH_SHORT).show() }
    }
}