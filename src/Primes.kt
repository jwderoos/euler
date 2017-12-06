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