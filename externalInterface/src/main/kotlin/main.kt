import kotlin.browser.window

fun main(args: Array<String>) {
    window.onload = {
        val fromSomeLibrary = fromSomeLibrary()
        println(fromSomeLibrary.id) // 42
        println(fromSomeLibrary.id::class) // Int
        printClass(fromSomeLibrary.id) // String
        println(fromSomeLibrary.id + 2) // 422
        printSum(fromSomeLibrary.id, 2) // 422
    }
}

private fun fromSomeLibrary(): External {
    val fromSomeLibrary = js("{}")
    fromSomeLibrary.id = "42"
    return fromSomeLibrary.unsafeCast<External>()
}

external interface External {
    var id: Int
}

fun printClass(subject: Any) {
    println(subject::class)
}

fun printSum(first: Int, second: Int) {
    println(first + second)
}