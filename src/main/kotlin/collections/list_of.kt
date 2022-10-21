fun main() {
    var nameList= listOf(1,2,3,4)

    println(nameList.size)
    println(nameList.indexOf(3))
    println(nameList[3])

    var res=nameList.contains(5)
    if(res){
        println("True")
    }else{

        println("False")
    }

}