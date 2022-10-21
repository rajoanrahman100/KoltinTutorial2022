package collections

fun main() {
    //MutableListOf
    var numberList= mutableListOf(1,2,3,4,"OK",6,7)
    numberList.add(8)
    numberList.remove(2)
    numberList.removeAt(2)
    for(i in numberList){
        print(i)
    }

    println()
    //MutableSetOf
    var nameList= mutableMapOf(1 to "Rifat",2 to "Bisty",3 to "Ihan")
    nameList.put(4,"Ramisa")
//    nameList.replace(2,"Sawlin")
    nameList.remove(2)

    print(nameList.toString())
}