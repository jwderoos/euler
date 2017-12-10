class Triangular {
    fun getNValue(n: Long) : Long {
        return n * (n + 1) /2
    }

    fun countDivisors(triangle : Long) : Long
    {
        val zero : Long = 0
        var tr = triangle
        if (tr.rem(2) == zero) {
            tr /= 2
        }

        var divisors : Long = 1
        var count = 0
        while (tr.rem(2) == zero) {
            count++
            tr /= 2
        }
        divisors *= (count +1)

        var p : Long = 3
        while (tr != (1).toLong()) {
            count = 0
            while (tr.rem(p) == zero) {
                count += 1
                tr /= p
            }
            divisors *= (count +1)
            p += 2
        }

        return divisors
    }
}