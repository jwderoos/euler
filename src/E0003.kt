class Primes {
    fun generatePrimes(maxValue: Int) : List<Int> {
        val numbers: MutableList<Int> = mutableListOf<Int>();

        for (i in 2..maxValue) {
            if (this.isPrime(i)) {
                numbers.add(i);
            }
        }
        return numbers;
    }

    fun isPrime(number: Int) : Boolean {
        for (i in 2..number / 2) {
            if (number.rem(i) == 0) {
                return false;
            }
        }
        return true;
    }
}

fun main(args: Array<String>) {
    val Primes : List<Int> = Primes().generatePrimes(10000);

    val Input = 600851475143;
    for (prime in Primes) {
        if (Input.rem(prime) == 0.toLong()) {
            println(" " + Input + " % " + prime + " = " + Input.rem(prime))
        }
    }
}