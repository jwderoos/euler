fun main(args: Array<String>) {
    val triangular = Triangular();
    var tr : Long = 1
    var left = triangular.countDivisors(tr)
    var right = triangular.countDivisors(tr + 1)

    while (left * right < 500) {
        left = right;
        tr++;
        right = triangular.countDivisors(tr + 1)
    }

    println(triangular.getNValue(tr));
}