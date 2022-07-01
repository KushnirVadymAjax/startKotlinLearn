//AAAABBBCCXYZDDDDEEEFFFAAAAAABBBBBBBBBBBBBBBBBBBBBBBBBBBB -> A4B3C2XYZD4E3F3A6B28

fun main() {

    var leters = "AAAABBBCCXYZDDDDEEEFFFAAAAAABBBBBBBBBBBBBBBBBBBBBBBBBBBB".split("").drop(1).dropLast(1)
    counter(leters);
}

fun counter(leters: List<String>): String {
    var result = ""
    var curentLeter = leters[0];
    var count = 0;
    for (el in leters) {
        if (el == curentLeter) {
            count++
        } else {
            if (count == 1) {
                result += curentLeter
            } else {
                result += curentLeter + count
            }
            count = 1
            curentLeter = el;
        }
    }

    if (count == 1)
        result += curentLeter
    else
        result += curentLeter + count

    println(result)
    return result
}