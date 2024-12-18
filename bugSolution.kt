fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val result = list.map { it * 2 }
    println(result) // Output: [2, 4, 6, 8, 10]

    val mutableList = mutableListOf(1, 2, 3, 4, 5)
    //To modify the mutable list, use mapIndexedTo or mapTo
    mutableList.mapIndexedTo(mutableList){index, i -> i * 2}
    println(mutableList) //Output: [2, 4, 6, 8, 10]

    //Alternative using mapTo:
    val newList = mutableListOf<Int>()
    mutableList.mapTo(newList){it * 2}
    println(newList) //Output: [2, 4, 6, 8, 10]
    println(mutableList) //Output: [1, 2, 3, 4, 5]
} 