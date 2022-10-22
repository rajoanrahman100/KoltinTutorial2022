package interface_example

//Static final variable
//abstract function
//java 8-->can be declared static function and default

interface A{

    fun show()
}

interface B{
    fun display()
}

class C:A,B{
    override fun show() {
        TODO("Not yet implemented")
    }

    override fun display() {
        TODO("Not yet implemented")
    }

}

fun main() {

}