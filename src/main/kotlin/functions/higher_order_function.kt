fun main() {
    //A function which can accept function as a parameter  and also return a function is called higher
    //order function

    var lamda={println("This is higher order function")}; //Lambda Expression
    higherFunction(lamda)

    var lambda={a:Int,b:Int->a+b} //Lambda Expression
    higherOrderFunctionWithReturn(lambda)

}

fun higherFunction(lmda:()->Unit){ //Accepting lambda as a parameter
    lmda() //Invoke lambda function
}

fun higherOrderFunctionWithReturn(lmda: (Int,Int) -> Int){
    var result =lmda(1,2)

    println("Lmda value is $result")
}

