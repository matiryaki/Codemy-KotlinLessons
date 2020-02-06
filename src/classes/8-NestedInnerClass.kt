package classes

class School : Shape() {

    private val schoolName = "Codemy"
    val schoolType = "Online"

    class LawSchool {
        val studentCount: Int = 5000

        fun printOuterName() {
//            println("Outher School Name : $schoolName")
//            println("Outher School Type : $schoolType")
        }
    }

    inner class MedSchool : Daire("Daire") {

        val studentCount: Int = 5000

        fun printOuterName() {
            println("Outher School Name : ${schoolName}")
            println("Outher School Type : ${schoolType}")
            println("Shape $shape")
        }

        inner class TechSchool : Shape()
    }
}

fun main() {

    val lawSchool = School.LawSchool()
    lawSchool.printOuterName()
    lawSchool.studentCount

    val medSchool = School().MedSchool()
    medSchool.studentCount
    medSchool.printOuterName()

    val techSchool = School().MedSchool().TechSchool()
}