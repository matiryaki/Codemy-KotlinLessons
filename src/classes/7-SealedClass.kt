package classes

sealed class Fruit {
    class Apple : Fruit()
    class Banana : Fruit()

    object GetFruit : Fruit() {
        fun getFruit(): Fruit {
            return Apple()
        }
    }
}

fun main() {
//    val fruit = Fruit()
//    val apple2 = Apple()
    val apple = Fruit.Apple()
    val banana = Fruit.Banana()
    val getFruit = Fruit.GetFruit

    printFruit(apple)
    printFruit(banana)
    printFruit(getFruit)
}

fun printFruit(fruit: Fruit) {
    when (fruit) {
        is Fruit.Apple -> {
            println("Apple")
        }
        is Fruit.Banana -> {
            println("Banana")
        }
        Fruit.GetFruit -> {
            print("Apple + Banana")
        }
    }
}