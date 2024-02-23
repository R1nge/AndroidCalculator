package com.r1nge.calculator

data class CalculatorState(
    val number1: String = "",
    val number2: String = "",
    val operation: CalculatorAction.CalculatorOperation? = null
)
