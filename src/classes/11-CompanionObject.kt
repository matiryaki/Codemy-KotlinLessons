package classes

const val name = "codemy"

class Photo {

//    const val name = "codemy"

    val photoUrl1 = "${BASE_URL}ç2rujf9834guj8239djk890guj23d-fjıogu37o4f3ı809g34hjf"
    val photoUrl2 = "${BASE_URL}655u6n56j435hw6j7y56m7uy656mu656u56u56um5u5u56un56b"
    val photoUrl3 = "${BASE_URL}ç2ru5y56j67ıöo9l78k67ı76uj56uh6565867l87y8j768j68hjf"
    val photoUrl4 = "${BASE_URL}56j6579o87ş0ç89ırhfyjmöçpoıhbdftjlöşljçlşkşljhjbtyjbj"

    fun printAll() {
        photoUrl1.log()
        photoUrl2.log()
        photoUrl3.log()
        photoUrl4.log()
    }

    companion object {

        const val NAME = "codemy"

        var BASE_URL = "www.google.com.tr/"
        @JvmStatic
        var BASE_URL2 = "www.google.com.tr/"

        fun print() {
//            photoUrl2.log()

        }
    }

//    companion object {
//
//        var BASE_URL = "www.google.com.tr/"
//
//        fun print() {
////            photoUrl2.log()
//
//        }
//    }
}

fun main() {

    val photo = Photo()
    photo.printAll()

    Photo.BASE_URL = "www.yandex.com.tr/"
    Photo.BASE_URL2 = "www.yandex.com.tr/"

    val photop2 = Photo()
    photop2.printAll()
}