package collections

fun main() {
    var nameArray=ArrayList<String>()
    nameArray.add("Rifat")
    nameArray.add("Bisty")
    nameArray.add("Ihan")
    print(nameArray.toString())
    nameArray.add(3,"Ramisa")
    nameArray.remove("Ihan")
    nameArray.set(2,"Ahnaf")
    println()
    for (i in nameArray){
        print(" $i ")
    }
}