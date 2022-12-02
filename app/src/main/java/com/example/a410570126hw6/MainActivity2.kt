package com.example.a410570126hw6

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.os.ResultReceiver

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var tvTable2 = findViewById<TextView>(R.id.tv_table2)

        tvTable2.text = intent.getStringExtra("dataTransfer")


        findViewById<Button>(R.id.btn_enter1).setOnClickListener {
            lateinit var mealA: CheckBox
            lateinit var mealB: CheckBox
            lateinit var mealC: CheckBox
            lateinit var mealD: CheckBox
            mealA = findViewById(R.id.mealA)
            mealB = findViewById(R.id.mealB)
            mealC = findViewById(R.id.mealC)
            mealD = findViewById(R.id.mealD)
            var meal1 = if (mealA.isChecked) "A餐" else ""
            var meal2 = if (mealB.isChecked) "B餐" else ""
            var meal3 = if (mealC.isChecked) "C餐" else ""
            var meal4 = if (mealD.isChecked) "D餐" else ""
            val meal = "$meal1 $meal2 $meal3 $meal4"

            val intent = Intent().apply{
                putExtra("result","$meal")
            }
            setResult(Activity.RESULT_OK, intent)

            finish()
        }
    }
}