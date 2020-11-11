package com.nqt.fooddy.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.Toast
import com.nqt.fooddy.R
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN)
        btnRegister.setOnClickListener {
            if (btnRegister.text == getString(R.string.sign_in)){
                llRegister.visibility = View.INVISIBLE
                ll_otp.visibility = View.VISIBLE
                btnRegister.text = getString(R.string.tiep_tuc)
            }else{
                Toast.makeText(this,"Bạn đã đăng ký thành công",Toast.LENGTH_SHORT).show()
                startActivity(Intent(this,LoginActivity::class.java))
            }

        }
    }
}