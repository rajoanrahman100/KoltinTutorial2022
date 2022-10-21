package class_object

fun main() {
//    SecondaryConstructor("Rifat",27)
    TwoSecondaryConstructor("Rifat",27)
    TwoSecondaryConstructor("Rifat",27,"Saydabad")
    CallingOneSecondaryConstructorToOther(10,20)
}

class SecondaryConstructor{
    constructor(name:String,age:Int){
        var n:String=name
        var a:Int=age
        println("My Name is $n")
        println("My Age is $a")
    }
}
//Todo:Two Secondary Constructor

class TwoSecondaryConstructor{
    constructor(name:String,age:Int){
        var n:String=name
        var a:Int=age
        println("My Name is $n")
        println("My Age is $a")
    }

    constructor(name:String,age:Int,address:String){
        var n:String=name
        var a:Int=age
        var ad:String=address
        println("My Name is $n")
        println("My Age is $a")
        println("My Address is $ad")
    }
}

//Todo:Call one constructor from another one

class CallingOneSecondaryConstructorToOther{

    constructor(a:Int,b:Int):this(a,b,30){ //Calling another constructor like this
        println("Sum of $a and $b is ${a+b}")
    }

    constructor(a:Int,b:Int,c:Int){
        println("Sum of $a and $b and $c is ${a+b+c}")
    }
}