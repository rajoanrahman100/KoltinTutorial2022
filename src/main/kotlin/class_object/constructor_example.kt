package class_object

//A clas in Kotlin have at most one primary constructor and one or more secondary constructor
//Some primary constructor initializes the class, while the secondary constructor is used to initialize the class
//as well as some extra logic

//Todo:Primary Constructor
/*The primary constructor goes after class name,using constructor keyword.Parameters are optionals
in Primary Constructor*/

class Add constructor (a:Int,b:Int){ //"constructor" keyword can be omitted
    var c=a+b
}

fun main() {
    var obj=Add(10,20)
    var name=Name("Rifat")
    println("Sum of two is ${obj.c}")
}

//TODO:Constructor with init block
class Name(name: String) {

    //init block call before calling the constructor
    init {
        println("Init A")
    }

    init {
        println("Init B")
    }
}