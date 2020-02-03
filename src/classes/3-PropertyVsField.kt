package classes

import java.util.*

class AwesomeCodemy {
    open val name = "Codemy"

    var website = "Codemy.Live" // get degisemiyor.
        private set
    var twitterAccount: String = ""
        set(value) {
            field = value.toLowerCase(Locale("tr", "TR"))
        }
}

fun main() {
    val awesomeCodemy = AwesomeCodemy()

    awesomeCodemy.name
//    awesomeCodemy.website = "google.com"

    println(awesomeCodemy.twitterAccount)

    awesomeCodemy.twitterAccount = "@CodemyLive"

    println(awesomeCodemy.twitterAccount)
}