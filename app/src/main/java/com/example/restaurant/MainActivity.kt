package com.example.restaurant

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var Txtview: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Txtview=findViewById(R.id.txt_restaurant)
        Txtview.setOnClickListener{
            val intent = Intent(this,Introduction::class.java)
            startActivity(intent)
        }


    }
}