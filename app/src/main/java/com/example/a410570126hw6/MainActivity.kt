package com.example.a410570126hw6

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btn_mainfood).setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivityForResult(intent, 1)
        }

        findViewById<Button>(R.id.btn_drink).setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivityForResult(intent, 1)
        }

        findViewById<Button>(R.id.btn_renew).setOnClickListener {
            val intent = intent
            finish()
            startActivity(intent)
        }

        val ed_num = findViewById<EditText>(R.id.ed_tableNum)
        if (ed_num.length() < 1)
                ed_num.hint = "請輸入桌號!!"


    }
}