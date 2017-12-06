import kotlin.math.sqrt

fun main(args: Array<String>) {
    for (a in 1..500) {
        for (b in a..500) {
            val a2 = a * a
            val b2 = b * b
            val c2 = a2 + b2
            val c = sqrt(c2.toDouble()).toInt()
            if (c2.rem(c) != 0) {
                continue;
            }

            if (b >= c) {
                continue;
            }

            val sum = a + b + c

            if (sum == 1000) {
                val product = a * b * c
                println(a.toString() + " " + b.toString() + " " + c.toString() + " " + sum + " " + product)
            }
        }
    }
}