import java.util.Arrays

// input -> ["eat","tea","tan","ate","nat","bat"]
//         output -> [["ate","eat","tea"], ["nat","tan"],["bat"]]

fun main() {
    groupWords(arrayOf("eat", "tea", "tan", "ate", "nat", "bat"))
}

fun groupWords(words: Array<String>) {
    var wordMap: MutableMap<String, MutableList<String>> = mutableMapOf()

    for (word in words) {
        val key = word.toCharArray().sorted().joinToString("")

        if (wordMap.containsKey(key))
            wordMap.get(key)?.add(word)
        else
            wordMap.put(key, mutableListOf(word))

    }
    println(wordMap)
}

