package collections

fun main() {

    //Kotlin distinguishes between immutable and mutable maps. 
    //Immutable maps created with mapOf() means these are read-only and mutable maps created with mutableMapOf() means we can perform read and write both.
    
    var nameMap= mapOf<Int,String>(1 to "New",2 to "View",3 to "Dart")

    println("Map Entries : "+nameMap)
 
    println("Map Keys: "+nameMap.keys )
 
    println("Map Values: "+nameMap.values )
}
