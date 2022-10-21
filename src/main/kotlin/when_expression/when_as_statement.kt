package when_expression

fun main() {
    print("Enter Your Most Liked Movie: ")
    var name= readln()

    when(name){
        "Batman"-> println("Batman")
        "Superman"-> println("Superman")
        "John Wick"-> println("John Wick")
        else-> println("No movies i liked")
    }
}