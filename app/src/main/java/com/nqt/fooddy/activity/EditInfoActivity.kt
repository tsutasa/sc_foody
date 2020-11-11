package com.nqt.fooddy.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Toast
import com.nqt.fooddy.R
import kotlinx.android.synthetic.main.activity_edit_info.btnBack
import kotlinx.android.synthetic.main.activity_edit_info.btnC

class EditInfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_info)
        window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN)
        btnBack.setOnClickListener { onBackPressed() }
        btnC.setOnClickListener {
            Toast.makeText(this,"Bạn đã thay đổi thành công", Toast.LENGTH_SHORT).show()
        }
    }
}