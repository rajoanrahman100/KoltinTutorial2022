package visibility_modifier

fun main() {
    var obj=VisibilityModifier()
    obj.display()
    println("My Age is ${obj.age}")
}

//Public: Visible from everywhere
//Private: Visible only inside the class
//internal: Visible inside the module

class VisibilityModifier{
    private var name="Rifat"
    var age=29


    fun display(){
        println("Name is $name")
    }


}