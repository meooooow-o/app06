package com.example.a410570126hw6

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnMeal = findViewById<Button>(R.id.btn_meal)
        var btnDrink = findViewById<Button>(R.id.btn_drink)
        var tableNo = findViewById<EditText>(R.id.ed_tableNo)
        var txtTableNo = tableNo.text
        var tvMeal = findViewById<TextView>(R.id.tv_meal)
        var tvDrink = findViewById<TextView>(R.id.tv_drink)


        val myActivityLauncher2 = registerForActivityResult(MyActivityResultContract2()){
            tvMeal.text = "主餐: $result"
        }


        btnMeal.setOnClickListener {
            if (tableNo.length() < 1)
                tableNo.hint = "請輸入桌號!!"
            else{
                val intent = Intent(this, MainActivity2::class.java)
                startActivityForResult(intent, 1)}
        }

        btnDrink.setOnClickListener {
            if (tableNo.length() < 1)
                tableNo.hint = "請輸入桌號!!"
            else{
                val intent = Intent(this, MainActivity3::class.java)
                startActivityForResult(intent, 1)}
        }


        findViewById<Button>(R.id.btn_renew).setOnClickListener {
            val intent = intent
            finish()
            startActivity(intent)
        }



    }
}