fun main() {
//    let()
//    with1()
//    with2()
//    run1()
//    run2()
//    apply()
    also()
}

fun let() {
    val numbers = mutableListOf("one", "two", "three", "four", "five")
    numbers.map { it.length }.filter { it > 3 }.let {
        println(it)
        //  if need write more fun
    }

    numbers.map { it.length }.filter { it > 3 }.let(::println)
}

fun with1() {
    val numbers = mutableListOf("one", "two", "three")
    with(numbers) {
        println("'with' called with arg $this")
        println("List contain $size el")
    }
}

fun with2() {
    val numbers = mutableListOf("one", "two", "three")
    val firstAndLast = with(numbers) {
        "First el - ${first()}," +
                " last el - ${last()}"
    }
    println(firstAndLast)
}

class MultiportService(var url: String, var port: Int) {
    fun query(request: String): String = "Request on : '$request'"
}

fun run1() {
    val service = MultiportService("localhost", 80)

    val result = service.run {
        port = 8080
        query(this.url + ":" + this.port)
    }

    println(result)
}

fun run2() {
    val numbers = mutableListOf("one", "two", "three")
    run {
        println(" 'run' called with arg $numbers")
    }
}

data class Person_(var name: String, var age: Int = 0, var city: String = "")

fun apply() {
    val adam = Person_("Adam").apply {
        age = 32
        city = "London"
    }
    println(adam)
}

fun also() {
    val numbers = mutableListOf("one", "two", "three")
    numbers
        .also { println("List before add new item: $it") }
        .add("four")
    println("List after added item: $numbers")
}