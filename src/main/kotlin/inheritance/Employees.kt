package inheritance

//Todo: To permit the derive class inherit from the base class, we have to use "open" keyword
// in-front of base class

open class Employees {
    var name="Rifat"

    fun a(){
        println("Function From Base Class")
    }
}

class MyName:Employees(){

    fun display(){
        println("My Name is $name")
    }


}

fun main() {
    var obj=MyName()
    obj.display()
    obj.a()
}