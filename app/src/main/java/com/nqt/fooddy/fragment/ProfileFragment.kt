package com.nqt.fooddy.fragment

import android.app.Activity
import android.app.AlertDialog
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.nqt.fooddy.R
import com.nqt.fooddy.activity.ChangePassActivity
import com.nqt.fooddy.activity.EditInfoActivity
import com.nqt.fooddy.activity.SecurityActivity
import kotlinx.android.synthetic.main.fragment_profile.view.*


class ProfileFragment : Fragment(), View.OnClickListener {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v = inflater.inflate(R.layout.fragment_profile, container, false)
        initView(v)
        return v
    }

    private fun initView(v: View) {
        v.llXt.setOnClickListener(this)
        v.llCp.setOnClickListener(this)
        v.llSo.setOnClickListener(this)
    }

    override fun onClick(p0: View) {
        when(p0.id){
            R.id.llXt -> {
                startActivity(Intent(activity, SecurityActivity::class.java))
            }
            R.id.llCp -> {
                startActivity(Intent(activity, ChangePassActivity::class.java))
            }
            R.id.llSo -> {
                sout()
            }
            R.id.btnSetting->{
                startActivity(Intent(activity,EditInfoActivity::class.java))
            }
        }
    }

    private fun sout() {
        val builder: AlertDialog.Builder = AlertDialog.Builder(context)

        builder.setTitle(getString(R.string.sign_out)).setMessage("Do you want to sign out?")

        builder.setPositiveButton("Yes", DialogInterface.OnClickListener { dialog, id ->
            Toast.makeText(
                context, "You choose Yes button",
                Toast.LENGTH_SHORT
            ).show()
            val activity = context as Activity
            dialog.dismiss()
        })

        // Create "No" button with OnClickListener.

        // Create "No" button with OnClickListener.
        builder.setNegativeButton("No", DialogInterface.OnClickListener { dialog, id ->
            Toast.makeText(
                context, "You choose No button",
                Toast.LENGTH_SHORT
            ).show()
            //  Cancel
            dialog.dismiss()
        })


        val alert: AlertDialog = builder.create()
        alert.show()
    }


}