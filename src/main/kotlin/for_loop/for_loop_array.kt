fun main() {
    //Traverse an array without using index property
    var arrayOne = arrayOf(1, 2, 3, 4, 5, 6);

    for (num in arrayOne) {
        //print(num)
        if (num % 2 == 0) {
            println("Even Number $num")
        }
    }

    //Traverse an array with using index property:

    var arrayStrings = arrayOf("One", "Two", "Three", "Four");
    for (i in arrayStrings.indices) {
        println("${arrayStrings[i]} ")
    }

    //Traverse an array using withIndex() Library Function
    var planets = arrayOf("Earth", "Mars", "Venus", "Jupiter", "Saturn")
    for((index,value) in planets.withIndex()){
        println("Value of $index is $value")
    }

    //Iterate through collection using for loop –
    var collection= listOf("One",2,3,2.10,"Four") //read only,size fix

    for(value in collection){
        println(value)
    }

}