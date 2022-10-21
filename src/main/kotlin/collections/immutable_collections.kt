package collections

fun main() {
    //It means that it supports only read-only functionalities and can not be modified its elements.
    //1. listOf()
    //2. setOf()
    //3. mapOf()
    var numberList= listOf(1,3,4,5,6,7)
    var numberSet= setOf(1,1,4,5,5,6,7)
    var numberMap= mapOf(1 to "One",2 to "Two",3 to "Three",4 to "Four")


    println("List Of")
    for(i in numberList){
        print("$i")
    }
    println()
    println("Set Of")
    for(i in numberSet){
        print("$i")
    }
    println()
    println("Map Of")

    for((key,value ) in numberMap){
        print("$value")
    }
}