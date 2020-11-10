package com.nqt.fooddy.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import com.nqt.fooddy.R
import kotlinx.android.synthetic.main.activity_main.*

@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN)
        btnLogin.setOnClickListener {
            startActivity(Intent(this,LoginActivity::class.java))
        }
        tvRegis.setOnClickListener {
            startActivity(Intent(this,RegisterActivity::class.java))
        }
    }
}