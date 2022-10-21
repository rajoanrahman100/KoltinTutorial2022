fun main() {
    print("Enter The Number Of The Month: ")
    var number= readln().toInt()

    var result=when(number){
        1->"Jan"
        2->"Feb"
        3->"Mar"
        4->"Apr"
        5->"May"
        6->"Jun"
        else->"Not Matched"
    }

    println(result)
}