package com.bor96dev.calculator

sealed class Operation(val symbol: String) {
    object Add : Operation("+")
    object Subtract : Operation("-")
    object Multiply : Operation("*")
    object Divide : Operation("/")
}
