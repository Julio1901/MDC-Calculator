package com.examplecrud.mmccalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.examplecrud.mmccalculator.MdcService.Companion.calculateMdc
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCalculate = calculate
        val result = result



        btnCalculate.setOnClickListener {


            val numberOne = Integer.parseInt(numberOne.text.toString())
            val numberTwo = Integer.parseInt(numberTwo.text.toString())
            val resultCalculate = calculateMdc(numberOne, numberTwo)


            result.setText("The least common divisor between the numbers is: " + resultCalculate.toString())

        }



    }
}