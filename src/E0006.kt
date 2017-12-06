fun main(args: Array<String>) {
    val two = 2
    var sum : Int = 0
    var squareSum : Int = 0
    for (i in 1..100) {
        sum += i
        squareSum += Math.pow(i.toDouble(), two.toDouble()).toInt()
    }

    val sumSquare :Int = sum * sum

    println(sumSquare - squareSum)
    return
}