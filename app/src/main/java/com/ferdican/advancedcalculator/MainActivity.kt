package com.ferdican.advancedcalculator

import android.os.Bundle
import android.view.View
import android.widget.Toast
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

    private var tempNum = ""
    private var num1 = 0.0
    private var num2Str = ""
    private var operation = ""
    private var isCalculated = false

    fun division(view: View) {
        if(!isCalculated){
            num1 = tempNum.toDouble()
            tempNum += "÷"
            binding.textViewOperationWindow.text = tempNum
            operation = "division"
            isCalculated = true
        }
    }

    fun multiplication(view: View) {
        if(!isCalculated){
            num1 = tempNum.toDouble()
            tempNum += "×"
            binding.textViewOperationWindow.text = tempNum
            operation = "multiplication"
            isCalculated = true
        }
    }

    fun subtraction(view: View) {
        if(!isCalculated){
            num1 = tempNum.toDouble()
            tempNum += "-"
            binding.textViewOperationWindow.text = tempNum
            operation = "substraction"
            isCalculated = true
        }
    }

    fun addition(view: View) {
        if(!isCalculated){
            num1 = tempNum.toDouble()
            tempNum += "+"
            binding.textViewOperationWindow.text = tempNum
            operation = "addition"
            isCalculated = true
        }
    }

    fun equal(view: View) {
        val num2 : Double? = num2Str.toDoubleOrNull()

        if (operation == "division" && num2 != null) {
            isCalculated=false
            binding.textViewOperationWindow.text = (num1 / num2).toString()
        } else if (operation == "multiplication" && num2 != null) {
            isCalculated=false
            binding.textViewOperationWindow.text = (num1 * num2).toString()
        } else if (operation == "substraction" && num2 != null) {
            isCalculated=false
            binding.textViewOperationWindow.text = (num1 - num2).toString()
        } else if (operation == "addition" && num2 != null) {
            isCalculated=false
            binding.textViewOperationWindow.text = (num1 + num2).toString()
        } else{
            Toast.makeText(this, "Please enter nums", Toast.LENGTH_SHORT).show()
        }

    }

    fun zero(view: View) {
        tempNum += "0"
        if (isCalculated) {
            num2Str += "0"
        }
        binding.textViewOperationWindow.text = tempNum
        isCalculated = false
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