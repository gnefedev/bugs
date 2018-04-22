package com.gnefedev

val comparator = compareBy<Sample> { it.name }

data class Sample(
    val name: String
)