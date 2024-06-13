package com.example.restaurant

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class Singup: AppCompatActivity() {

    lateinit var EdtEmail: EditText
    private lateinit var EdtPass: EditText
    lateinit var EdtConPass: EditText
    private lateinit var BtnSignup: Button
    lateinit var EdtName: EditText
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_singup)
        EdtName=findViewById(R.id.txt_name)
        EdtEmail=findViewById(R.id.txt_EmailAddress)
        EdtPass=findViewById(R.id.txt_newPassword)
        EdtConPass=findViewById(R.id.txt_confirmPassword)
        BtnSignup=findViewById(R.id.btn_signup)
        auth=Firebase.auth

        BtnSignup.setOnClickListener {
            SignUpUser()
        }

    }

    private fun SignUpUser() {
        val name=EdtName.text.toString()
        val email=EdtEmail.text.toString()
        val pass=EdtPass.text.toString()
        val confirmpass=EdtConPass.text.toString()
        if (name.isBlank() || email.isBlank() || pass.isBlank() || confirmpass.isBlank()){
            Toast.makeText(this,"Please Email and password cant be blank",Toast.LENGTH_LONG).show()
            return
        }  else if (pass != confirmpass){
            Toast.makeText(this,"Password do not match",Toast.LENGTH_LONG).show()
            return

        }
        auth.createUserWithEmailAndPassword(email,pass).addOnCompleteListener(this) {
            if (it.isSuccessful){
                Toast.makeText(this,"Signed successfully",Toast.LENGTH_LONG).show()
                finish()
                val intent=Intent(this,MapActivity::class.java)
                startActivity(intent)

            }else{
                Toast.makeText(this,"Failed to create",Toast.LENGTH_LONG).show()
            }

        }

    }
}