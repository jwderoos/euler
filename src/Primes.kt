class Primes {
    fun generatePrimes(maxValue: Int) : List<Int> {
        val numbers: MutableList<Int> = mutableListOf<Int>()

        for (i in 2..maxValue) {
            if (this.isPrime(i)) {
                numbers.add(i)
            }
        }
        return numbers
    }

    fun generateFirstNPrimes(primeCount : Int) : List<Int> {
        val primes: MutableList<Int> = mutableListOf<Int>()
        var current : Int = 2;

        while (primes.count() < primeCount) {
            if (isPrime(current)) {
                primes.add(current);
            }
            current++;
        }

        return primes
    }

    fun getPrime(index : Int) : Int {
        return generateFirstNPrimes(index).last();
    }

    fun isPrime(number: Int) : Boolean {
        for (i in 2..number / 2) {
            if (number.rem(i) == 0) {
                return false
            }
        }
        return true
    }
}