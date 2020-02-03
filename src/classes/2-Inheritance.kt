package classes

//abstract class Shape{
//    fun draw(){
//
//    }
//
//    fun fill(){
//
//    }
//}

open class Shape {
    open val shape: String = "Empty"
    open val color: String = "Blue"
    open var edge = 0

    open fun draw() {
        println(shape)
    }

    fun fill() {

    }
}

class Rectangle : Shape() {

//    init {
//        draw()
//    }

    override val shape: String
        get() = """
                *********
                *       *
                *********
        """.trimIndent()

    override fun draw() {
        super.draw()
        println("Rectangle created.")
    }
}


class Triangle : Shape() {

//    init {
//        fill()
//    }

    override val shape: String
        //        get() = super.shape
        get() = """
                *
               ***
              *****
        """.trimIndent()

}

class Square : Shape()

open class Daire constructor(override val shape: String) : Shape() {

    protected var number: Int = 3

    override val color: String = "Black"

    override var edge: Int
        get() = super.edge
        set(value) {}

//    fun fill(){
//
//    }
}

class Circle : Daire("Circle") { // extend edilen class private ise extend etmeye izin verilmez

    private val dede1 =
        Daire("asdasd") // class private iken aynı dosya icerisinde farklı bir class'da instance yaratmaya izin veriliyor. Ancak bu instance'ın kendisi de private olmak zorunda

    override val color: String
        get() = super.color

    fun printColor() {
        println(color)
        number = 4
    }
}

class FinalShape {

    open val name: String = ""

//    override val name : String = "asdasd"
}

//class Hexagon : FinalShape()

fun main() {

    val triangle = Triangle()
    val rectangle = Rectangle()
    val square = Square()
    val daire = Daire("O") // aynı dosyada olmak şartıyla, main içinde public nesne olusturmaya izin veriliyor.
    val circle = Circle()

//    daire.number

    triangle.draw()
    rectangle.draw()
    square.draw()
    println(daire.color)
    circle.printColor()
}