package classes

//final kullanilamiyor.
interface AnimalEvent {
    //    init {
//
//    }
    val animalName: String

    fun move(isFly: Boolean, isSwim: Boolean, isWalk: Boolean = false) {
        when (this::class.simpleName.toString()) {
            "Fish" -> {
                "Fish".log()
            }
            "Bird" -> {
                "Bird".log()
            }
            "Cats" -> {
                "Cats".log()
            }
        }

        println("Interface : isFly : $isFly, isSwim : $isSwim, isWalk : $isWalk")
        println("Interface : isFly : $isFly, isSwim : $isSwim, isWalk : $isWalk")
    }

    fun makeSound() {
        println("Make a sound")
    }

    fun eat(isCarnivorous: Boolean)

    fun isNeedOxygen() {}
}

fun String.log() {
    println(this)
}

interface WalkEvent {
    fun slowSpeedWalk()
    fun fastSpeedWalk()
}

class Fish(override val animalName: String) : AnimalEvent {

//    override fun move(isFly: Boolean, isSwim: Boolean, isWalk: Boolean) {
//    }

    override fun makeSound() {
        super.makeSound()
        println("Blop blop")
    }

    override fun eat(isCarnivorous: Boolean) {
    }

}

class Bird : AnimalEvent {
    override val animalName: String = "Bird"

    override fun move(isFly: Boolean, isSwim: Boolean, isWalk: Boolean) {

    }

//    override fun makeSound() {
//        super.makeSound()
//        println("Blop blop")
//    }

    override fun eat(isCarnivorous: Boolean) {
//        super.eat(isCarnivorous)
    }
}

//class Cats : AnimalEvent, Animal(), Plant(), WalkEvent{
class Cats : Animal(), AnimalEvent, WalkEvent {
    override val animalName: String
        get() = "Cats"

    override fun move(isFly: Boolean, isSwim: Boolean, isWalk: Boolean) {
        super<Animal>.move(isFly, isSwim, isWalk)
        super<AnimalEvent>.move(isFly, isSwim, isWalk)
        println("Bodysiz cagirim")
    }

//    override fun makeSound() {
//        super.makeSound()
//    }

    override fun eat(isCarnivorous: Boolean) {
    }

    override fun slowSpeedWalk() {

    }

    override fun fastSpeedWalk() {
    }
}


open class Animal {
    open fun move(isFly: Boolean, isSwim: Boolean, isWalk: Boolean) {
        println("Class : isFly : $isFly, isSwim : $isSwim, isWalk : $isWalk")
    }
}

open class Plant

fun main() {
    val cats = Cats()
    val bird = Bird()
    val fish = Fish("Fish")
    cats.move(false, false, true)
    bird.move(true, false)
    fish.move(false, true, false)

//    val baseAnimal = BaseAnimal()
    val animalEvent = object : AnimalEvent {
        override val animalName: String
            get() = ""

        override fun eat(isCarnivorous: Boolean) {
        }
    }
}


abstract class BaseAnimal {
    //    abstract val name : String = "Kangal"
    abstract val name: String
    open val animalType: String = ""
    val animalColor = "blue"

    //    abstract fun printName(){}
    abstract fun printName()

    open fun printName2() {

    }
}

class SivasKangali(override val name: String) : BaseAnimal() {
    override val animalType: String
        get() = super.animalType

    override fun printName() {
    }

    override fun printName2() {
        super.printName2()
        print("asdad")
    }
}