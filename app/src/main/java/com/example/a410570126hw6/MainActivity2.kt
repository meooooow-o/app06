package com.example.a410570126hw6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        findViewById<Button>(R.id.btn_enter1).setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivityForResult(intent, 1)
        }
    }
}