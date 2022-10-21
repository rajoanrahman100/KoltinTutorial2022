import java.util.Scanner

fun main() {

    var num = 10;

    var value = Scanner(System.`in`)
    print("Enter Three Integer: ")
    var intOne = value.nextInt();
    var intTwo = value.nextInt();
    var intThree = value.nextInt();
    val result = if (intOne > intTwo && intOne > intThree) {
        "$intOne is greater"
    } else if (intTwo > intOne && intTwo > intThree) {
        "$intTwo is greater"
    } else {
        "$intThree is greater"
    }

    println(result)
}