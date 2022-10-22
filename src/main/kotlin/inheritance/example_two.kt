package inheritance

open class Employee(name:String,age:Int,salary:Int){ //Primary Constructor
    init {
        println("My name is $name, $age years old and earning $salary per month. ")
    }
}

class WebDev(name:String,age:Int,salary:Int):Employee(name,age,salary){
    fun website(){
        println("I am a website dev")
    }
}

class AndroidDev(name:String,age:Int,salary:Int):Employee(name,age,salary){
    fun android(){
        println("I am an android dev")
    }
}

fun main() {
    var webDev=WebDev("Rifat",27,45000)
    webDev.website()
    var appDev=AndroidDev("Bristy",27,55000)
    appDev.android()
}