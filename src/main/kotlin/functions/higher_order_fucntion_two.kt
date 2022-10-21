fun main() {
    //Passing function as a parameter to Higher-Order function –

    //There are two types of function which can be passed
    //1. Function which return unit
    //2. Function which return integer,string etc

    //Function which return Unit
    higherOrderFunction("Hello There",::printValue)
    higherFunctionInteger(::addTwoNumber)
    //Function which return Integer


}

//Function which return Unit
fun printValue(s:String){
    println(s)
}

fun higherOrderFunction(s: String,printF:(s:String)->Unit){
    printF(s)
}

//Function which return Integer
fun addTwoNumber(a:Int,b:Int):Int{
    val sum=a+b
    return  sum
}

fun higherFunctionInteger(addFunc:(Int,Int)->Int){
    val result=addFunc(2,6)
    println("Sum of two number:: $result")
}
