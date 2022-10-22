package interface_example

//Static final variable
//abstract function
//java 8-->can be declared static function and default

interface A {

    fun show()
    fun sum(){
        println("Sum of 1 and 2 is: ${1+2}")
    }
}

interface B {
    fun display()

    fun sum(){
        println("Sum of 2 and 3 is: ${2+3}")
    }
}

class C : A, B {
    override fun show() {
        println("Show Function")
    }

    override fun display() {
        println("Display Function")
    }

    override fun sum() {
        super<A>.sum()//Calling the sum() fun of A interface
        super<B>.sum()//Calling the sum() fun of B interface
    }



}

fun main() {
    var c=C()
    c.show()
    c.display()
    c.sum()
}