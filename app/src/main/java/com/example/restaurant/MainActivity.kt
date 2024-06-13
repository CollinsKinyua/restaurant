package com.example.restaurant

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.os.Handler
import android.view.LayoutInflater

class MainActivity : AppCompatActivity() {
    private val SPLASH_DISPLAY_LENGTH = 3000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       val inflater = LayoutInflater.from(this@MainActivity)
       val view = inflater.inflate(R.layout.activity_main, null)
        installspalshScreen()



        Handler().postDelayed({
            val mainIntent = Intent(this, Introduction::class.java)
            startActivity(mainIntent)
            finish()
        }, SPLASH_DISPLAY_LENGTH.toLong())


    }

   private fun installspalshScreen() {

   }
}