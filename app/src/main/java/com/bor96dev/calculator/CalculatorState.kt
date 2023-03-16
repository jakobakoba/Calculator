package com.bor96dev.calculator

data class CalculatorState(
    val number1: String = "",
    val number2: String = "",
    val operation: Operation? = null,
)

