package functions

import java.util.*
import kotlin.concurrent.schedule

fun main() {

    val higherOrderFunction = { surName: String ->
        "surName : $surName"
    }

    val anonymousFunction = fun(surName: String): String {
        return "surName : $surName"
    }

    val anonymousFunction2 = fun(surName: String): String = "surName : $surName"

    val news = News()
    news.read(::print)

    printUserInfo(getName(), {
        "surname : $it"
    }, getAge())

    printUserInfo(getName(), higherOrderFunction, getAge())
    printUserInfo(getName(), anonymousFunction, getAge())
    printUserInfo(getName(), fun(surName: String): String {
        return "surName : $surName"
    }, getAge())

    getItemClickListener({ buttonName ->
        println("$buttonName tıklandı..")
    })

    val newsType = NewsType()
    news.getNewsFromServer("FoxTv", newsType, {
        println(this.toString())
    })

    news.getNewsFromServer("FoxTv", newsType) {
        println(this.toString())
    }

    news.filterNews { filterType, getFilterName ->

    }
}

fun getName(): String {
    return "Gökhan"
}

fun getAge(): Int = 29

fun printUserInfo(name: String, getSurName: (surName: String) -> String = { "" }, age: Int): Unit {
    println("name: $name , age : $age")

    println(getSurName("ÖZTÜRK"))
}

fun getItemClickListener(onClick: (String) -> Unit) {

    println("Tiklama islemi baslatiliyor")

    Timer().schedule(3000) {
        onClick("Login")

        println("Tiklama islemi bitti")
    }
}

/* -------------------------------------------------------------------------------------------------------------------*/

class News {
    fun getNewsType(newsType: NewsType): String {
        return when (newsType.toString()) {
            NewsType.breakingNews -> "Breaking"
            NewsType.urgent -> "Urgent"
            NewsType.local -> "Local"
            NewsType.global -> "Global"
            else -> "Normal"
        }
    }
}

class NewsType {
    companion object {
        val breakingNews = "BreakingNews"
        val urgent = "Urgent"
        val local = "Local"
        val global = "Global"
        val normal = "Normal"
    }
}

fun News.getNewsFromServer(channelType: String, newsType: NewsType, getNews: NewsType.(Int) -> Unit) {
    when (channelType) {
        "KanalD" -> {
            getNews(newsType, 1)
        }
        "ShowTv" -> {
            getNews(newsType, 2)
        }
        "Tv8" -> {
            getNews(newsType, 3)
        }
        "FoxTv" -> {
            getNews(newsType, 3)
        }
        "CNN" -> {
            getNews(newsType, 3)
        }
    }
}

infix fun News.filterNews(getFilter: (filterType: String, getFilterName: () -> String) -> Unit) {

    getFilter("filterName") {
        "String return label"
    }
}

fun News.read(readTitle: (String) -> Unit) {
    readTitle("Codemy is Awesome")
}