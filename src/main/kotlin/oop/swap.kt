package oop

fun swapElementsAtEvenIndices(array1: IntArray, array2: IntArray): Pair<IntArray, IntArray> {
    require(array1.size == array2.size) { "Arrays must be of the same length" }

    val resultArray1 = IntArray(array1.size)
    val resultArray2 = IntArray(array2.size)

    for (i in array1.indices) {
        if (i % 2 == 0) {
            resultArray1[i] = array2[i]
            resultArray2[i] = array1[i]
        } else {
            resultArray1[i] = array1[i]
            resultArray2[i] = array2[i]
        }
    }

    return Pair(resultArray1, resultArray2)
}

fun main() {
    // Example arrays (you can replace these with user input)
    val array1 = intArrayOf(1, 2, 3, 4, 5)
    val array2 = intArrayOf(6, 7, 8, 9, 10)

    val (resultArray1, resultArray2) = swapElementsAtEvenIndices(array1, array2)

    println("Original Arrays:")
    println("Array 1: ${array1.joinToString(", ")}")
    println("Array 2: ${array2.joinToString(", ")}")

    println("\nArrays after swapping elements at even indices:")
    println("Result Array 1: ${resultArray1.joinToString(", ")}")
    println("Result Array 2: ${resultArray2.joinToString(", ")}")
}
