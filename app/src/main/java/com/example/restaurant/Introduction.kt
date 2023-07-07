package com.example.restaurant

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Introduction : AppCompatActivity() {
    lateinit var Buttonsgnup : Button
    lateinit var Buttonlogin : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_introduction)
        Buttonsgnup=findViewById(R.id.btn_Signupintroduction)
        Buttonlogin=findViewById(R.id.btn_Signinintroduction)


        Buttonsgnup.setOnClickListener{
            val signup = Intent(this,Singup::class.java)
            startActivity(signup)
        }
        Buttonlogin.setOnClickListener{
            val login = Intent(this,LoginActivity::class.java)
            startActivity(login)
        }
    }
}