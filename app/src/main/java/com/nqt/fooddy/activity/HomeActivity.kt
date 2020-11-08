package com.nqt.fooddy.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.WindowManager
import androidx.appcompat.app.ActionBar
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.nqt.fooddy.R
import kotlinx.android.synthetic.main.activity_home.*

@Suppress("DEPRECATION")
class HomeActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {
    private lateinit var toolbar: ActionBar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        initView()
    }

    private fun initView() {
        window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN)
        toolbar = supportActionBar!!
        nav.setOnNavigationItemSelectedListener(this)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.navHome -> {
                return true
            }
            R.id.navLove -> {
                return true
            }
            R.id.navBuy -> {
                return true
            }
            R.id.navNotification -> {
                return true
            }
            R.id.navProfile -> {
                return true
            }
        }
        return false
    }
}