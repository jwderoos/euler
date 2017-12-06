fun main(args: Array<String>) {
    val Primes : List<Int> = Primes().generatePrimes(10000);

    val Input = 600851475143;
    for (prime in Primes) {
        if (Input.rem(prime) == 0.toLong()) {
            println(" " + Input + " % " + prime + " = " + Input.rem(prime))
        }
    }
}