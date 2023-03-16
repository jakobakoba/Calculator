package com.bor96dev.calculator

sealed class Action {
    data class Number(val number: Int) : Action()
    object Clear : Action()
    object Delete : Action()
    object Decimal : Action()
    object Calculate : Action()
    data class Operation(val operation: CalculatorOperation) : Action()
}
