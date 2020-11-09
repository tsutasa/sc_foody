package com.nqt.fooddy.activity

import android.os.Bundle
import android.view.MenuItem
import android.view.WindowManager
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.nqt.fooddy.R
import com.nqt.fooddy.fragment.*
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
//        toolbar = supportActionBar!!
        nav.setOnNavigationItemSelectedListener(this)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.navHome -> {
                val fragment = HomeFragment()
                loadFragment(fragment)
                return true
            }
            R.id.navLove -> {
                val fragment = FavouriteFragment()
                loadFragment(fragment)
                return true
            }
            R.id.navBuy -> {
                val fragment = CartFragment()
                loadFragment(fragment)
                return true
            }
            R.id.navNotification -> {
                val fragment = NotificationFragment()
                loadFragment(fragment)
                return true
            }
            R.id.navProfile -> {
                val fragment = ProfileFragment()
                loadFragment(fragment)
                return true
            }
        }
        return false
    }
    private fun loadFragment(fragment: Fragment) {
        // load fragment
        val transaction: FragmentTransaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}