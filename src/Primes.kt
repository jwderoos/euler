class Primes {
    fun generatePrimes(maxValue: Int) : List<Int> {
        print("Generating primes until " + maxValue + "...")
        val primes: MutableList<Int> = mutableListOf<Int>()

        if (2 < maxValue) {
            primes.add(2)
        }

        for (i in 3..maxValue) {
            if (this.isPrime(i, primes)) {
                primes.add(i)
            }
        }

        println("Done.")
        return primes
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

    fun isPrime(number: Int, primes : List<Int>) : Boolean
    {
        for (prime in primes) {
            if (prime / 2 > number) {
                break
            }
            if (number.rem(prime) == 0) {
                return false
            }
        }
        return true
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