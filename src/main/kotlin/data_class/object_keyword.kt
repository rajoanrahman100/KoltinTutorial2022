package data_class


data class Student(var name: String, var id: Int)

//Todo:To convert a class into singleton class, object keyword is used
//Object keyword insured that,only one object can be created for a particular class
object AbcInstitution {
    var students = arrayListOf<Student>()
}

fun main() {

    AbcInstitution.students.add(Student("Rifat", 27))
    AbcInstitution.students.add(Student("Bristy", 23))
    AbcInstitution.students.add(Student("Sakib", 15))

    for (i in AbcInstitution.students) {
        println(i)
    }

}