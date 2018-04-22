package com.gnefedev

val usingCommonType = SomeDto(
    com.gnefedev.BigDecimal(0.0)
)

val usingJvmType = SomeDto(
    java.math.BigDecimal(0.0)
)