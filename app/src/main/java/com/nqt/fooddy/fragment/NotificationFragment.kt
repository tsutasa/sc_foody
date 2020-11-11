package com.nqt.fooddy.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.nqt.fooddy.R
import com.nqt.fooddy.activity.DetailsNotiAvtivity
import kotlinx.android.synthetic.main.fragment_notification.view.*


class NotificationFragment : Fragment(), View.OnClickListener {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v = inflater.inflate(R.layout.fragment_notification, container, false)
        initView(v)
        return v
    }

    private fun initView(v: View) {
        v.ll1.setOnClickListener(this)
        v.ll2.setOnClickListener(this)
        v.ll3.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        startActivity(Intent(activity,DetailsNotiAvtivity::class.java))
    }
}