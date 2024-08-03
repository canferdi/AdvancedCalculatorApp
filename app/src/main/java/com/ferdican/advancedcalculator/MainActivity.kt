package com.ferdican.advancedcalculator

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.ferdican.advancedcalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var currentOperation = ""
    private var firstNumber = ""
    private var lastOperator = ' '
    private var showNum = " "

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

        // numbers click lambdas
        binding.buttonZero.setOnClickListener { numberClick(it) }
        binding.buttonOne.setOnClickListener { numberClick(it) }
        binding.buttonTwo.setOnClickListener { numberClick(it) }
        binding.buttonThree.setOnClickListener { numberClick(it) }
        binding.buttonFour.setOnClickListener { numberClick(it) }
        binding.buttonFive.setOnClickListener { numberClick(it) }
        binding.buttonSix.setOnClickListener { numberClick(it) }
        binding.buttonSeven.setOnClickListener { numberClick(it) }
        binding.buttonEight.setOnClickListener { numberClick(it) }
        binding.buttonNine.setOnClickListener { numberClick(it) }

        //operators click lambdas
        binding.buttonDivision.setOnClickListener { operatorClick(it) }
        binding.buttonMultiplication.setOnClickListener { operatorClick(it) }
        binding.buttonSubtraction.setOnClickListener { operatorClick(it) }
        binding.buttonAddition.setOnClickListener { operatorClick(it) }
        binding.buttonPercent.setOnClickListener { operatorClick(it) }

        // equal click lambda
        binding.buttonEquals.setOnClickListener { equal(it) }

        // AC click lambda
        binding.buttonAC.setOnClickListener { AC(it) }
        binding.buttonBackSpace.setOnClickListener { backSpace(it) }

    }

    private fun numberClick(view: View) {
        if (view is Button) {
            val number = view.text.toString()
            currentOperation += number
            showNum += number
            updateOperationWindow()
        }
    }

    private fun operatorClick(view: View) {
        if (view is Button) {
            val operator = view.text.toString()
            if (currentOperation.isNotEmpty()) {
                if (lastOperator != ' ') {
                    calculateResult()
                } else {
                    firstNumber = currentOperation
                    showNum += operator
                    updateOperationWindow()
                }
                lastOperator = operator[0]
                currentOperation = ""
            }
        }
    }

    private fun equal(view: View) {
        if (lastOperator != ' ' && currentOperation.isNotEmpty()) {
            calculateResult()
        }
    }

    private fun calculateResult() {
        val currentNum = currentOperation.toDouble()
        val firstNum = firstNumber.toDouble()
        var result = 0.0
        when (lastOperator) {
            '+' -> result = firstNum + currentNum
            '-' -> result = firstNum - currentNum
            'x' -> result = firstNum * currentNum
            '÷' -> result = if (currentNum != 0.0) firstNum / currentNum else 0.0
            '%' -> result = currentNum % firstNum
        }
        showNum = result.toString()
        updateOperationWindow()
        firstNumber = result.toString()
        showNum = ""
    }

    private fun AC(view: View) {
        currentOperation = ""
        firstNumber = ""
        showNum = " "
        lastOperator = ' '
        updateOperationWindow()
    }

    private fun backSpace(view: View) {
        if (currentOperation.isNotEmpty()) {
            currentOperation = currentOperation.dropLast(1)
            showNum = showNum.dropLast(1)
            updateOperationWindow()
        }
    }

    private fun updateOperationWindow() {
        binding.textViewOperationWindow.text = showNum
    }


}