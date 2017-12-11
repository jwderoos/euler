import java.io.File

fun main(args: Array<String>) {
    val file = File("I0013")
    val list : List<String> = file.readLines().toList()

    val sum = list.reduce({sum, add -> an.add(sum, add) })

    println(sum.substring(0, 10))
}