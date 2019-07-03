package com.example.logindemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLogin.setOnClickListener{
            val intent = Intent(this, SecondActivity::class.java)
            var status=if(etUser.text.toString().equals("admin")
                && etPassword.text.toString().equals("12345678")) "Login Successfully"  else "Login Failed"
            Toast.makeText(this,status,Toast.LENGTH_LONG).show()
            if (status.toString().equals("Login Successfully")) {
                startActivity(intent)
            }
        }
    }
}