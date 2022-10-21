package functions

fun main() {
    var result = sumOfTwo(30, 20)
    println("Sum of Two: $result")
    var value=sumOfList(arrayOf(1,2,3,4,5))

    print(value)
}

//Sum of two number
fun sumOfTwo(a: Int, b: Int): Int {
    return a + b;
}

//Sum of a List of numbers
fun sumOfList(a: Array<Int>):Int {
    var sum=0
    for(i in a){
        sum+=i
    }
    return sum
}