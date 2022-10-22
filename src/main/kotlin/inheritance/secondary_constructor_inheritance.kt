package inheritance

open class EmployeeInfo{
    constructor(name: String,role:String){
        println("Employee Name is $name\nRole is $role")
    }
}

class CEO:EmployeeInfo{
    constructor(name: String,role:String,salary:Int):super(name,role){
        println("Salary of Per Annual is $salary")
    }
}

fun main() {
    var ceo=CEO("Elon Musk","CEO",2500000)
}



