package com.example.kotlinsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.layout_view_binding.*
import android.widget.Toast.makeText as makeText1
import android.widget.Toast.makeText as makeText2

class BmiKotlinActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //ui로 사용할 레이아웃 xml 파일을 지정
        setContentView(R.layout.layout_view_binding)

        bmibutton.setOnClickListener{

            val tall=tallField.text.toString().toDouble()
            val weight=weightField.text.toString().toDouble()

            val bmi=weight/Math.pow(tall/100,2.0)

            resultLabel.text="키 : ${tallField.text}, 체중: ${weightField.text}, BMI : $bmi"

        }
    }
}
