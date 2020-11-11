package com.nqt.fooddy.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import com.nqt.fooddy.R
import com.nqt.fooddy.activity.DetailsActivity
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_home.view.*


class HomeFragment : Fragment(), View.OnClickListener {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val v = inflater.inflate(R.layout.fragment_home, container, false)
        initView(v)
        return v
    }

    private fun initView(v: View) {
        v.btnHq.setOnClickListener(this)
        v.btnRc.setOnClickListener(this)
        v.btnDk.setOnClickListener(this)
        v.ctFood1.setOnClickListener(this)
        v.ctFood2.setOnClickListener(this)
        v.ll1.setOnClickListener(this)
        v.ll2.setOnClickListener(this)
        v.ll3.setOnClickListener(this)
        v.ll4.setOnClickListener(this)
    }

    override fun onClick(p0: View) {
        when(p0.id){
            R.id.btnHq->{
                btnHq.background = ContextCompat.getDrawable(context!!,R.drawable.bg_login)
                btnDk.background = ContextCompat.getDrawable(context!!,R.drawable.bg_shadow)
                btnRc.background = ContextCompat.getDrawable(context!!,R.drawable.bg_shadow)
                btnHq.setTextColor(ContextCompat.getColor(context!!,R.color.white))
                btnDk.setTextColor(ContextCompat.getColor(context!!,R.color.black))
                btnRc.setTextColor(ContextCompat.getColor(context!!,R.color.black))
                ivThumb.setImageResource(R.drawable.orange_from_gardencopy)
                ivThumb2.setImageResource(R.drawable.dau_da_lat)
                food1.setImageResource(R.drawable.vai_thieucopy)
                food4.setImageResource(R.drawable.orange_from_gardencopy)
                food2.setImageResource(R.drawable.dau_da_lat)
                food3.setImageResource(R.drawable.cut_whole_orange_fruits_with_green_leaves)

            }
            R.id.btnRc->{
                btnHq.background = ContextCompat.getDrawable(context!!,R.drawable.bg_shadow)
                btnDk.background = ContextCompat.getDrawable(context!!,R.drawable.bg_shadow)
                btnRc.background = ContextCompat.getDrawable(context!!,R.drawable.bg_login)
                btnHq.setTextColor(ContextCompat.getColor(context!!,R.color.black))
                btnDk.setTextColor(ContextCompat.getColor(context!!,R.color.black))
                btnRc.setTextColor(ContextCompat.getColor(context!!,R.color.white))
                ivThumb.setImageResource(R.drawable.bap_xai_xanh_dau_vang_huwycopy)
                ivThumb2.setImageResource(R.drawable.raumuong)
                food1.setImageResource(R.drawable.bap_xai_xanh_dau_vang_huwycopy)
                food2.setImageResource(R.drawable.suplo)
                food3.setImageResource(R.drawable.raumuong)
                food4.setImageResource(R.drawable.suplo)
            }
            R.id.btnDk->{
                btnHq.background = ContextCompat.getDrawable(context!!,R.drawable.bg_shadow)
                btnDk.background = ContextCompat.getDrawable(context!!,R.drawable.bg_login)
                btnRc.background = ContextCompat.getDrawable(context!!,R.drawable.bg_shadow)
                btnHq.setTextColor(ContextCompat.getColor(context!!,R.color.black))
                btnDk.setTextColor(ContextCompat.getColor(context!!,R.color.white))
                btnRc.setTextColor(ContextCompat.getColor(context!!,R.color.black))
                ivThumb.setImageResource(R.drawable.huongduong)
                ivThumb2.setImageResource(R.drawable.pablo_merchan_montes_scbq6ukcymy_unsplashcopy)
                food1.setImageResource(R.drawable.hatcuoi)
                food2.setImageResource(R.drawable.hatdieu)
                food3.setImageResource(R.drawable.huongduong)
                food4.setImageResource(R.drawable.hatcuoi)
            }
            R.id.ctFood1->{
                startActivity(Intent(activity,DetailsActivity::class.java))
            }
            R.id.ctFood2->{
                startActivity(Intent(activity,DetailsActivity::class.java))
            }
            R.id.ll1->{
                startActivity(Intent(activity,DetailsActivity::class.java))
            }
            R.id.ll2->{
                startActivity(Intent(activity,DetailsActivity::class.java))
            }
            R.id.ll3->{
                startActivity(Intent(activity,DetailsActivity::class.java))
            }
            R.id.ll4->{
                startActivity(Intent(activity,DetailsActivity::class.java))
            }
        }
    }


}