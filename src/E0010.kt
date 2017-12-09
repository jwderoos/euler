fun main(args: Array<String>) {
    val primes = Primes();
    var sum  = (0).toLong();
    for (prime in primes.generatePrimes(2000000)) {
        sum += prime;
    }

    println(sum);
}