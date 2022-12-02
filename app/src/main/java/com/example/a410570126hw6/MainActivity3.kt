package com.example.a410570126hw6

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity3 : AppCompatActivity() {
    lateinit var selectedDrink: RadioButton
    lateinit var ice: RadioButton
    lateinit var sugar: RadioButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        var tvTable3 = findViewById<TextView>(R.id.tv_table3)

        var drinkGroup = findViewById<RadioGroup>(R.id.radio1)
        var sugarGroup = findViewById<RadioGroup>(R.id.radio2)
        var iceGroup = findViewById<RadioGroup>(R.id.radio3)


        tvTable3.text = intent.getStringExtra("dataTransfer")

        findViewById<Button>(R.id.btn_enter2).setOnClickListener {

            var selectedOption: Int = iceGroup!!.checkedRadioButtonId
            ice = findViewById(selectedOption)

            var selectedOption: Int = sugarGroup!!.checkedRadioButtonId
            sugar = findViewById(selectedOption)

            var selectedOption: Int = drinkGroup!!.checkedRadioButtonId
            selectedDrink = findViewById(selectedOption)

            val finalDrink = "${selectedDrink.text} \n\n甜度:${sugar.text} \n\n冰塊:${ice.text}"

            val intent = Intent().apply {
                putExtra("result","$finalDrink")
            }

            setResult(Activity.RESULT_OK,intent)
            finish()
        }
    }
}