package classes

class Car2 constructor(val paramCarType: String) {

    var carType: String = paramCarType
    var carColor: String = ""
    var carType2: String

    init {
        this.carType = paramCarType
        this.carColor = ""
        this.carType2 = "Cartype"
    }

    constructor(carType: String, carColor: String) : this(carType) { // secondary const. val ya da var tanimi yapilamaz.
        this.carType = carType
        this.carColor = carColor
        this.carType2 =
            "Cartype" // init blogunda atama olmazsa bu degiskene secondary const. icersinde deger atanmasina izin verilmez.
    }

    fun printTypeAndColor() {
        println("carType : ${this.carType} , carColor : $carColor")
        println("carType : $paramCarType , carColor : $carColor")
    }
}

class Car3 {

    init {
        println("initialize 2")
    }

    constructor(carType: String, carColor: String) {
        println("secondaryconst")
    }

    init {
        println("initialize 1")
    }
}

class Car(type: String = "Default value") {

    val carType: String = "Metal".also {
        println(it)
    }

    constructor(type: String, color: String) : this() {
        println("type : $type, color : $color")
    }

    constructor(type: String = "23213", color: String, count: Int) : this(type) {
        println("primary const. type : $type")
    }

    init {
        println("primary const. type : $type")
    }
}

class DontCreateInstanceFromMe private constructor() { // class'i private yapmak instance'nin yaratilmasina engel degil.

    val instance = DontCreateInstanceFromMe()

    private constructor(number: Int) : this()
}

abstract class DontCreateInstanceFromMeAbstract {

//    val instance = DontCreateInstanceFromMeAbstract()
}

fun main() {
//    val carInsance = Car()
//    val carInsance2 = Car("MiniCooper")
//    val carInsance3 = Car("MiniCooper", "blue")
//    val carInsance4 = Car(color ="blue", count =  5)

//    val carInstance = Car3("MiniCooper", "blue")

    val charInstance = Car2("MiniCooper")
    val charInstance2 = Car2("MiniCooper", "blue")

    charInstance.printTypeAndColor()
    charInstance2.printTypeAndColor()

//    val dontCreateInstanceFromMe = DontCreateInstanceFromMe()
//    val dontCreateInstanceFromMeAbstract = DontCreateInstanceFromMeAbstract()

    val daire = Daire("O")
}