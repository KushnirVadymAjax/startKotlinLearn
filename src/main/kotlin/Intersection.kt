// have 2 [1,2,3,2,0] and [5,1,2,7,3,2]
// need return [1,2,2,3]

fun main() {
    val a1 = intArrayOf(1, 2, 3, 2, 0);
    val a2 = intArrayOf(5, 1, 2, 7, 3, 2);
    getRepetedIntersection(a1, a2)
}

fun getRepetedIntersection(a1: IntArray, a2: IntArray): List<Int> {
    val hashSet1 = a1.toHashSet();
    val hashSet2 = a2.toHashSet();

    val res = mutableListOf<Int>()

    for (item in hashSet1) {
        if (hashSet2.contains(item)) {
            var countItemHashSet1 = 0;
            var countItemHashSet2 = 0;

            for (itemArray1 in a1) {
                if (item == itemArray1) {
                    countItemHashSet1++
                }
            }
            for (itemArray2 in a2) {
                if (item == itemArray2) {
                    countItemHashSet2++
                }
            }
            val countItem = minOf(countItemHashSet1, countItemHashSet2);
            repeat(countItem) {
                res.add(item);
            }

        }

    }
    println(res)
    return res;
}