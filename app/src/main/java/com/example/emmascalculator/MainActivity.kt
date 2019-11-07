package com.example.emmascalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.StringBuilder

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private var historyNumber: Int = 0
    private var currentNumber: Int = 0
    private var sum: Int = 0
    private val resultString = arrayListOf<String>()
    private var inputNumber: String = ""

    override fun onClick(v: View?) {

        when (v!!.id) {
            R.id.number0 -> {
                currentNumber = 0
                inputNumber = inputNumber.plus(currentNumber)
                inputField.text = inputNumber
            }
            R.id.number1 -> {
                currentNumber = 1
                inputNumber = inputNumber.plus(currentNumber)
                inputField.text = inputNumber
            }
            R.id.number2 -> {
                currentNumber = 2
                inputNumber = inputNumber.plus(currentNumber)
                inputField.text = inputNumber
            }
            R.id.number3 -> {
                currentNumber = 3
                inputNumber = inputNumber.plus(currentNumber)
                inputField.text = inputNumber
            }
            R.id.number4 -> {
                currentNumber = 4
                inputNumber = inputNumber.plus(currentNumber)
                inputField.text = inputNumber
            }
            R.id.number5 -> {
                currentNumber = 5
                inputNumber = inputNumber.plus(currentNumber)
                inputField.text = inputNumber
            }
            R.id.number6 -> {
                currentNumber = 6
                inputNumber = inputNumber.plus(currentNumber)
                inputField.text = inputNumber
            }
            R.id.number7 -> {
                currentNumber = 7
                inputNumber = inputNumber.plus(currentNumber)
                inputField.text = inputNumber
            }
            R.id.number8 -> {
                currentNumber = 8
                inputNumber = inputNumber.plus(currentNumber)
                inputField.text = inputNumber
            }
            R.id.number9 -> {
                currentNumber = 9
                inputNumber = inputNumber.plus(currentNumber)
                inputField.text = inputNumber
            }

            R.id.additionButton -> {
                resultString.add(inputNumber)
                resultString.add("+")
                val stringToShow = StringBuilder()
                for (element in resultString) {
                    stringToShow.append(element)
                }
                inputNumber = ""
                inputField.text = stringToShow
            }

            R.id.subtractionButton -> {
                resultString.add(inputNumber)
                resultString.add("-")
                val stringToShow = StringBuilder()
                for (element in resultString) {
                    stringToShow.append(element)
                }
                inputNumber = ""
                inputField.text = stringToShow
            }

            R.id.multiplicationButton -> {
                resultString.add(inputNumber)
                resultString.add("*")
                val stringToShow = StringBuilder()
                for (element in resultString) {
                    stringToShow.append(element)
                }
                inputNumber = ""
                inputField.text = stringToShow
            }

            R.id.divisionButton -> {
                resultString.add(inputNumber)
                resultString.add("/")
                val stringToShow = StringBuilder()
                for (element in resultString) {
                    stringToShow.append(element)
                }
                inputNumber = ""
                inputField.text = stringToShow
            }

            R.id.equalsButton -> {
                resultString.add(inputNumber)
                sum = calculate(resultString)
                inputField.text = sum.toString()
                resultString.clear()
                resultString.add(sum.toString())
                historyNumber = 0
                currentNumber = 0
                inputNumber = ""
                //For now, after = is pressed you cannot continue calculate on the input
                sum = 0
            }

            R.id.clearButton -> {
                sum = 0
                resultString.clear()
                currentNumber = 0
                historyNumber = 0
                inputNumber = ""
                inputField.text = sum.toString()
            }
        }
    }

    private fun calculate(listToCalculate: ArrayList<String>): Int{
        var secondNumber: Int
        var counter = 0
        var sum = listToCalculate[counter].toInt()
        var division = 0.0

        while (counter < listToCalculate.size-1) {
            var dunnoWhatToCallThisSendHalp = listToCalculate[counter]
            //Log.d("tag", listToCalculate[counter])

            if (listToCalculate[counter].equals("+")){
                secondNumber = listToCalculate[counter + 1].toInt()
                sum = addition(sum, secondNumber)
            } else if (listToCalculate[counter].equals("-")) {
                secondNumber = listToCalculate[counter + 1].toInt()
                sum = subtraction(sum, secondNumber)
            } else if (listToCalculate[counter].equals("*")) {
                secondNumber = listToCalculate[counter + 1].toInt()
                sum = multiplication(sum, secondNumber)
            } else if (listToCalculate[counter].equals("/")) {
                secondNumber = listToCalculate[counter + 1].toInt()
                division = division(sum, secondNumber)
                // TODO like how I fix division :(
            } else {

            }


            counter++
        }

        return sum
    }


    private fun setOnClicks() {
        number0!!.setOnClickListener(this)
        number1!!.setOnClickListener(this)
        number2!!.setOnClickListener(this)
        number3!!.setOnClickListener(this)
        number4!!.setOnClickListener(this)
        number5!!.setOnClickListener(this)
        number6!!.setOnClickListener(this)
        number7!!.setOnClickListener(this)
        number8!!.setOnClickListener(this)
        number9!!.setOnClickListener(this)
        additionButton!!.setOnClickListener(this)
        subtractionButton!!.setOnClickListener(this)
        multiplicationButton!!.setOnClickListener(this)
        divisionButton!!.setOnClickListener(this)
        equalsButton!!.setOnClickListener(this)
        clearButton!!.setOnClickListener(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setOnClicks()
    }

    fun addition(a: Int, b: Int): Int {
        return a + b
    }

    fun subtraction(a: Int, b: Int): Int {
        return a - b
    }

    fun division(a: Int, b: Int): Double {
        return (a.toDouble() / b.toDouble())
    }

    fun multiplication(a: Int, b: Int): Int {
        return a * b
    }

}
