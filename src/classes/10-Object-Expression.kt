package classes

open class TextView(text: String) {
    open val textSize: Int = text.length
}

interface OnTextChanged {
    fun textChanged()
}

fun main() {

    val textMessage = "Codemy"

    val textView: TextView = object : TextView(textMessage), OnTextChanged {
        override val textSize: Int
            get() = textMessage.length + 1

        override fun textChanged() {

        }
    }

    val studentName = "Gökhan"
    val studentAge = 29

    val student = object {
        val name = "Gökhan"
        val age = 29

        val prepStudent = object {
            val name = "PrepStudent"
            val age = "07"
        }
    }

    student.name
    student.age

    student.prepStudent.name
}