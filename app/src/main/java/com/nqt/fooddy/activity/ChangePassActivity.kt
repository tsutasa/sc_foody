package com.nqt.fooddy.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Toast
import com.nqt.fooddy.R
import kotlinx.android.synthetic.main.activity_change_pass.*

class ChangePassActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_change_pass)
        window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN)
        btnBack.setOnClickListener { onBackPressed() }
        btnC.setOnClickListener {
            Toast.makeText(this,"Bạn đã thay đổi mật khẩu thành công",Toast.LENGTH_SHORT).show()
        }
    }
}