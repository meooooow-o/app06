package com.example.a410570126hw6

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        var tvMeal = findViewById<TextView>(R.id.tv_meal)
        var tvDrink = findViewById<TextView>(R.id.tv_drink)
        var tvIce = findViewById<TextView>(R.id.tv_ice)
        var tvSweet = findViewById<TextView>(R.id.tv_sweet)

        data?.extras?.let {
            if (requestCode == 1 && resultCode == Activity.RESULT_OK) {
                tvMeal.text = "主餐： ${it.getString("meal")}"
                tvDrink.text = "飲料：${it.getString("drink")}"
                tvSweet.text = "甜度：${it.getString("sugar")}"
                tvIce.text = "冰塊：${it.getString("ice")}"
            }
        }

    }

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            var btnMeal = findViewById<Button>(R.id.btn_meal)
            var btnDrink = findViewById<Button>(R.id.btn_drink)
            var tableNo = findViewById<EditText>(R.id.ed_tableNo)

            btnMeal.setOnClickListener {
                if (tableNo.length() < 1)
                    tableNo.hint = "請輸入桌號!!"
                else {
                    val intent = Intent(this, MainActivity2::class.java)
                    startActivityForResult(intent, 1)
                    val b = Bundle()
                    b.putString("number",tableNo.text.toString())
                }
            }

            btnDrink.setOnClickListener {
                if (tableNo.length() < 1)
                    tableNo.hint = "請輸入桌號!!"
                else {
                    val intent = Intent(this, MainActivity3::class.java)
                    startActivityForResult(intent, 1)
                    val b = Bundle()
                    b.putString("number",tableNo.text.toString())
                }
            }


            findViewById<Button>(R.id.btn_renew).setOnClickListener {
                val intent = intent
                finish()
                startActivity(intent)
            }
        }
}