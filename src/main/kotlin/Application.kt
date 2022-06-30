fun main() {
//        val a = "asda";
//        val num1:Int = 12;
//        val num2:Int = 100;
//
//        println("Sum is ${num1 + num2}");
//
    val items = listOf(1, 2, 3, 4);
//
//        for (item in items){
//            println(item)
//        }
//        items.forEach{el -> println(el)}
//
//        var index = 0
//
//        while (index<items.size){
//            println("Item at $index is ${items[index]}")
//            index++
//        }
//
//        println(5 in 3..10)
//
//        for (i in 1..10)
//            println(i)

    for (i in 'a'..'d')
        println(i)

    "abc".split("").size
//        for (i in 1 until 10)
//            println(i)
//
//        for (i in 10 downTo 1)
//            println(i)

//        for (i in 1..100 step 10)
//            println(i)

//        println( test())
//        println(sum(1,2))


//        testNamedArgument(y=1,x=5,z=2);

//        testDefaultArgument(y=1)


//        testVararg(1,2,3,4,5)
//        testVararg(*intArrayOf(1,2,4,6,8))

}

fun test(): Int {
    return 1
}

fun sum(x: Int, y: Int) = x + y

fun testNamedArgument(x: Int, y: Int, z: Int): List<Int> {
    return listOf(x, y, z)
}

fun testDefaultArgument(x: Int = 7, y: Int) {
    println(x + y);
}

fun testVararg(vararg number: Int) {
    number.forEach { e -> println(e) }
}

