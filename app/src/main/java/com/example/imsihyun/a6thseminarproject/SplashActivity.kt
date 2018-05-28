package com.example.imsihyun.a6thseminarproject

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val handler = Handler()
        handler.postDelayed({
            // 자동로그인 처리
            if(SharedPreferenceController
                            .getID(this) == "") {
                startActivity(Intent(this, LoginActivity::class.java))
                finish()
            } else {
                val intent = Intent(this,
                        MainActivity::class.java)
                intent.putExtra("id",
                        SharedPreferenceController
                                .getID(this))
                startActivity(Intent(this, LoginActivity::class.java))
                finish()
            }


        startActivity(Intent(this, LoginActivity::class.java))
            finish()
        }, 3000)

    }
}
