package class_object

class Employee {
    var name:String=""
    var age:Int=0
    var gender:String=""

    fun insertValue(n:String,a:Int,g:String){
        name=n
        age=a
        gender=g
        print("My name $name\nMy age $age\nGender is $gender")
    }

    fun insertName(n:String){
        this.name=n
    }
}

fun main() {

    var obj=Employee()

    var obj2=Employee()

    obj.insertValue("Rifat",27,"Male")

    obj2.insertName("Bristy")

    println("\nMy Name is ${obj.name}")
}