package com.gnefedev

expect open class BigDecimal {
    constructor(double: Double)
    constructor(string: String)

    open fun add(var1: BigDecimal): BigDecimal
    open fun intValueExact(): Int
    open operator fun compareTo(other: BigDecimal): Int
}