fun main(args: Array<String>) {
    var i: Int = 1;
    var sum: Int = 0;

    val max = 1000;
    while (i < max) {
        if (i.rem(3) == 0 || i.rem(5) == 0) {
            println("adding " + i);
            sum = sum + i;
        }
        i++;
    }

    println(sum);
}