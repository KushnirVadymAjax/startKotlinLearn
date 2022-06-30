fun main() {
    testWhen(1)
    testWhen("1")
    testWhen(16)
    testWhen(1123)
}

fun testWhen(input: Any/*Any == Object*/) {
    when (input) {
        1 -> println("one")
        1 -> println("two")
        in 10..20 -> println("in 10..20")
        is String -> println(input.length);
        else -> println("some else")
    }
}