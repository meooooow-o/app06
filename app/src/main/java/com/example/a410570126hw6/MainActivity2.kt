package com.example.a410570126hw6

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import android.os.ResultReceiver

class MainActivity2 : AppCompatActivity() {
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        data?.extras?.let {
            if (requestCode == 1 && resultCode == Activity.RESULT_OK) {
                findViewById<TextView>(R.id.tv_table2).text = "${it.getString("number")}"
            }
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)



        findViewById<Button>(R.id.btn_enter1).setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivityForResult(intent, 1)
        }
    }
}