package com.ferdican.advancedcalculator

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.ferdican.advancedcalculator.databinding.ActivityMainBinding

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

    private var printNum = ""
    private var tempNum = ""
    private var num1 = 0.0
    private var num2Str = ""
    private var operation = ""
    private var isCalculated = false

    fun division(view: View) {
        isCalculated = true
        num1 = tempNum.toDouble()
        tempNum += "÷"
        binding.textViewOperationWindow.text = tempNum
        operation = "÷"
    }

    fun multiplication(view: View) {
        isCalculated = true
        num1 = tempNum.toDouble()
        tempNum += "×"
        binding.textViewOperationWindow.text = tempNum
        operation = "×"
    }

    fun subtraction(view: View) {
        isCalculated = true
        num1 = tempNum.toDouble()
        tempNum += "-"
        binding.textViewOperationWindow.text = tempNum
        operation = "-"
    }

    fun addition(view: View) {
        isCalculated = true
        num1 = tempNum.toDouble()
        tempNum += "+"
        binding.textViewOperationWindow.text = tempNum
        operation = "+"
    }

    fun equal(view: View) {
        val num2 = num2Str.toDouble()
        if (operation == "division") {
            binding.textViewOperationWindow.text = (num1 / num2).toString()
        } else if (operation == "multiplication") {
            binding.textViewOperationWindow.text = (num1 * num2).toString()
        } else if (operation == "substraction") {
            binding.textViewOperationWindow.text = (num1 - num2).toString()
        } else if (operation == "addition") {
            binding.textViewOperationWindow.text = (num1 + num2).toString()
        }
    }

    fun zero(view: View) {
        tempNum += "0"
        if (isCalculated) {
            num2Str += "0"
        }
        binding.textViewOperationWindow.text = tempNum
    }

    fun one(view: View) {
        tempNum += "1"
        if (isCalculated) {
            num2Str += "1"
        }
        binding.textViewOperationWindow.text = tempNum
    }

    fun two(view: View) {
        tempNum += "2"
        if (isCalculated) {
            num2Str += "2"
        }
        binding.textViewOperationWindow.text = tempNum
    }

    fun three(view: View) {
        tempNum += "3"
        if (isCalculated) {
            num2Str += "3"
        }
        binding.textViewOperationWindow.text = tempNum
    }

    fun four(view: View) {
        tempNum += "4"
        if (isCalculated) {
            num2Str += "4"
        }
        binding.textViewOperationWindow.text = tempNum
    }

    fun five(view: View) {
        tempNum += "5"
        if (isCalculated) {
            num2Str += "5"
        }
        binding.textViewOperationWindow.text = tempNum
    }

    fun six(view: View) {
        tempNum += "6"
        if (isCalculated) {
            num2Str += "6"
        }
        binding.textViewOperationWindow.text = tempNum
    }

    fun seven(view: View) {
        tempNum += "7"
        if (isCalculated) {
            num2Str += "7"
        }
        binding.textViewOperationWindow.text = tempNum
    }

    fun eight(view: View) {
        tempNum += "8"
        if (isCalculated) {
            num2Str += "8"
        }
        binding.textViewOperationWindow.text = tempNum
    }

    fun nine(view: View) {
        tempNum += "9"
        if (isCalculated) {
            num2Str += "9"
        }
        binding.textViewOperationWindow.text = tempNum
    }

    fun backSpace(view: View) {
        tempNum = tempNum.dropLast(1)
        binding.textViewOperationWindow.text = tempNum
    }

}