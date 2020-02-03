package classes

// name ve ordinal degiskenleri default olarak final oldugu icin override edilemezler.
// open bir class'ı miras almaya (extend) izin verilmez, ancak bir interface'i implement edebilirsiniz.
// abstract, open, sealed, inner,  data olamazlar.
enum class DirectionType(val code: Int, val ordinals: Int) : AnimalEvent {

//    EAST, WEST, NORTH, SOUTH

    EAST(100, 1) {
        override fun toString(): String {
            return "East"
        }

        override fun printFullValue() {
            println("name : ${EAST.name}, position : ${EAST.ordinal}")
        }

        override val animalName: String
            get() = ""

        override fun eat(isCarnivorous: Boolean) {
        }
    },
    WEST(200, 2) {
        override fun toString(): String {
            return "West"
        }

        override fun printFullValue() {
            println("name : ${WEST.name}, position : ${WEST.ordinal}")
        }

        override val animalName: String
            get() = ""

        override fun eat(isCarnivorous: Boolean) {
        }
    },
    SOUTH(300, 3) {
        override fun toString(): String {
            return "South"
        }

        override fun printFullValue() {
            println("name : ${SOUTH.name}, position : ${SOUTH.ordinal}")
        }

//        override fun move(isFly: Boolean, isSwim: Boolean, isWalk: Boolean) {
//            super.move(isFly, isSwim, isWalk)
//        }

        override val animalName: String
            get() = ""

        override fun eat(isCarnivorous: Boolean) {
        }
    },
    NORTH(400, 4) {
        override fun toString(): String {
            return "North"
        }

        override fun printFullValue() {
            println("name : ${NORTH.name}, position : ${NORTH.ordinal}")
        }

        override val animalName: String
            get() = ""

        override fun eat(isCarnivorous: Boolean) {
        }
    };

    //    fun printFullValue()
//    open fun printFullValue(){
//
//    }
    abstract fun printFullValue()
}

fun main() {
    setDirection("East", 1)
    setDirection("West", 2)
    setDirection("North", 3)
    setDirection("South", 4)

    println()

    setDirection(DirectionType.EAST.name, DirectionType.EAST.ordinal)
    setDirection(DirectionType.WEST.name, DirectionType.WEST.ordinal)
    setDirection(DirectionType.NORTH.name, DirectionType.NORTH.ordinal)
    setDirection(DirectionType.SOUTH.name, DirectionType.SOUTH.ordinal)

    println()

    setDirection(DirectionType.EAST.toString(), DirectionType.EAST.ordinal)
    setDirection(DirectionType.WEST.toString(), DirectionType.WEST.ordinal)
    setDirection(DirectionType.NORTH.toString(), DirectionType.NORTH.ordinal)
    setDirection(DirectionType.SOUTH.toString(), DirectionType.SOUTH.ordinal)

    println()

    DirectionType.EAST.printFullValue()
    DirectionType.WEST.printFullValue()
    DirectionType.NORTH.printFullValue()
    DirectionType.SOUTH.printFullValue()

    println()

    DirectionType.EAST.code.log()
    DirectionType.WEST.code.log()
    DirectionType.NORTH.code.log()
    DirectionType.SOUTH.code.log()

    DirectionType.EAST.ordinals.logOrdinal()
    DirectionType.WEST.ordinals.logOrdinal()
    DirectionType.NORTH.ordinals.logOrdinal()
    DirectionType.SOUTH.ordinals.logOrdinal()

    val directionType = DirectionType.NORTH
    val redirectionType = when (directionType) {
        DirectionType.EAST -> {
            DirectionType.EAST.toString()
        }
        DirectionType.WEST -> {
            DirectionType.WEST.toString()
        }
        DirectionType.NORTH -> {
            DirectionType.NORTH.toString()
        }
        DirectionType.SOUTH -> {
            DirectionType.SOUTH.toString()
        }
    }

    val directionType2 = "North"
    val redirectType2 = when (directionType2) {
        "East" -> {
            "EAST"
        }
        "West" -> {
            "WEST"
        }
        "North" -> {
            "NORTH"
        }
        "South" -> {
            "SOUTH"
        }
        else -> {
            "Else"
        }
    }
}

fun setDirection(direction: String, postion: Int) {
    println("direction $direction, postion $postion")
}

fun Int.log() {
    println("Direction Code : $this")
}

fun Int.logOrdinal() {
    println("Ordinal : $this")
}