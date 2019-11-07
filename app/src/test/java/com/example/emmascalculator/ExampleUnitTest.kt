package com.example.emmascalculator

import android.util.Log
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    lateinit var activity: MainActivity

    @Test
    fun addition_isCorrect() {
        activity = MainActivity()
        assertEquals(4, activity.addition(2,2))
    }

    @Test
    fun addition_isCorrect_Negative_Numbers() {
        activity = MainActivity()
        assertEquals(-4, activity.addition(-2,-2))
    }

    @Test
    fun addition_isCorrect_Negative_And_Positive_Numbers() {
        activity = MainActivity()
        assertEquals(0, activity.addition(-2,2))
    }

    @Test
    fun subtraction_isCorrect_Positive_Numbers() {
        activity = MainActivity()
        assertEquals(0, activity.subtraction(2,2))
    }

    @Test
    fun subtraction_isCorrect_Negative_Numbers() {
        activity = MainActivity()
        assertEquals(0, activity.subtraction(-2,-2))
    }

    @Test
    fun subtraction_isCorrect_Negative_And_Positive_Numbers() {
        activity = MainActivity()
        assertEquals(-4, activity.subtraction(-2,2))
    }

    @Test
    fun division_isCorrect_Positive_Numbers() {
        activity = MainActivity()
        assertTrue(2.0 == activity.division(4, 2))
    }

    @Test
    fun division_isCorrect_Negative_Numbers() {
        activity = MainActivity()
        assertTrue(2.0 == activity.division(-4, -2))
    }


    @Test
    fun division_isCorrect_Positive_Numbers_Decimal_Result() {
        activity = MainActivity()
        assertTrue(2.5 == activity.division(5, 2))
    }

    @Test
    fun division_isCorrect_Positives_And_Negative_Number() {
        activity = MainActivity()
        assertTrue(-2.5 == activity.division(5, -2))
    }


    @Test
    fun multiplication_isCorrect_Positive_Numbers() {
        activity = MainActivity()
        assertEquals(4, activity.multiplication(2,2))
    }

    @Test
    fun multiplication_isCorrect_Negative_Numbers() {
        activity = MainActivity()
        assertEquals(4, activity.multiplication(-2,-2))
    }

    @Test
    fun multiplication_isCorrect_Positive_And_Negative_Numbers() {
        activity = MainActivity()
        assertEquals(-4, activity.multiplication(-2,2))
    }
}
