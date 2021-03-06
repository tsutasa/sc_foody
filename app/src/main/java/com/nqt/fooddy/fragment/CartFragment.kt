package com.nqt.fooddy.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.nqt.fooddy.R
import com.nqt.fooddy.activity.CartActivity
import kotlinx.android.synthetic.main.fragment_cart.view.*

class CartFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v = inflater.inflate(R.layout.fragment_cart, container, false)
        initView(v)
        return v
    }

    private fun initView(v: View) {
        v.btnBuy.setOnClickListener {
            startActivity(Intent(activity,CartActivity::class.java))
        }
    }


}