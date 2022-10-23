package data_class


data class Employee(var name:String,var address:String){ //Primary Constructor

}

fun main() {
    var emp=Employee("Rifat","Saydabad")
    var emp2=Employee("Rifat2","Saydabad")

    println(emp)
    println(emp==emp2)

}

/**
 * If we want to compare two objet to see equal or not, we can put data before class name
 * If we want to print the primary constructor value of a class, we can put data and print the object of that class
 */
