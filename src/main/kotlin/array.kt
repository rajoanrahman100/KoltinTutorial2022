fun main() {
    val arrayName = arrayOf(1, 2, 3, 4, 5)
    val arrayNameTwo = arrayOf<String>("A", "B", "C")
    val arrayNameThree = arrayOf(10.4, 32.4, 23.5)

    for (i in arrayName) {
        print(i)
    }
    println()
    for (i in arrayNameThree.indices) {
        print(arrayNameThree[i])

    }
    println()
    arrayNameTwo.forEach { value ->
        print(value)
    }
}