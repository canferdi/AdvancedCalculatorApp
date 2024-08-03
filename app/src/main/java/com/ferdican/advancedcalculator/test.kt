/*package com.ferdican.advancedcalculator

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.ferdican.advancedcalculator.databinding.ActivityMainBinding
import kotlin.reflect.typeOf

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        enableEdgeToEdge()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    var operation: String = ""
    var number = 0.0
    var num1 = 0.0
    var num2 = 0.0
    var result = 0.0

    private fun showCalculator(num: Double) {
        number = number * 10 + num
        binding.textViewOperationWindow.text = number.toString()
    }

    fun division(view: View) {
        showCalculator("÷")
        operation = "÷"
        num1 = number.toDouble()
    }

    fun multiplication(view: View) {
        showCalculator("x")
        operation = "x"
        num1 = number.toDouble()
    }

    fun subtraction(view: View) {
        showCalculator("-")
        operation = "-"
        num1 = number.toDouble()
    }

    fun addition(view: View) {
        showCalculator("+")
        operation = "+"

        val doubleNum = number.dropLast(1).toDoubleOrNull()
        if (doubleNum != null) {
            num1 = doubleNum
        }

    }

    fun equal(view: View) {
        val num1Len = num1.toString().length -1
        println("num1 $num1")
        println("number $number")
        println("num1Len $num1Len")
        num2 = number.drop(num1Len).toDouble()
        println("num1 $num1")
        println("num2 $num2")


        when (operation) {
            "+" -> result = num1 + num2
            "-" -> result = num1 - num2
            "x" -> result = num1 * num2
            "÷" -> result = num1 / num2
        }
        println(result)
        binding.textViewOperationWindow.text = result.toString()

    }

    fun zero(view: View) {
        showCalculator("0")
    }

    fun one(view: View) {
        showCalculator("1")
    }

    fun two(view: View) {
        showCalculator("2")
    }

    fun three(view: View) {
        showCalculator("3")
    }

    fun four(view: View) {
        showCalculator("4")
    }

    fun five(view: View) {
        showCalculator("5")
    }

    fun six(view: View) {
        showCalculator("6")
    }

    fun seven(view: View) {
        showCalculator("7")
    }

    fun eight(view: View) {
        showCalculator("8")
    }

    fun nine(view: View) {
        showCalculator("9")
    }

    fun backSpace(view: View) {
        number = number.dropLast(1)
        binding.textViewOperationWindow.text = number
    }

    fun AC(view: View) {
        number = ""
        operation = ""
        num1 = 0.0
        num2 = 0.0
        result = 0.0
        binding.textViewOperationWindow.text = number
    }

}*/