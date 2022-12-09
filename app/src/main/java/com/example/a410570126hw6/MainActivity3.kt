package com.example.a410570126hw6

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity3 : AppCompatActivity() {
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        data?.extras?.let {
            if (requestCode == 1 && resultCode == Activity.RESULT_OK) {
                findViewById<TextView>(R.id.tv_table3).text = "${it.getString("number")}"
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val drinkGroup = findViewById<RadioGroup>(R.id.radio1)
        val sugarGroup = findViewById<RadioGroup>(R.id.radio2)
        val iceGroup = findViewById<RadioGroup>(R.id.radio3)

        findViewById<Button>(R.id.btn_enter2).setOnClickListener {
            val b = Bundle()
            b.putString("drink", drinkGroup.findViewById<RadioButton>
                (drinkGroup.checkedRadioButtonId).text.toString())
            b.putString("sugar", sugarGroup.findViewById<RadioButton>
                (sugarGroup.checkedRadioButtonId).text.toString())
            b.putString("ice", iceGroup.findViewById<RadioButton>
                (iceGroup.checkedRadioButtonId).text.toString())

            setResult(Activity.RESULT_OK, Intent().putExtras(b))
            finish()

        }
    }
}