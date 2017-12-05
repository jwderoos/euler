fun main(args: Array<String>) {
    var last: Int = 1;
    var current: Int = 1;
    var sum : Int = 0;
    var next: Int = 0;

    while (current <= 4000000) {
        println("current " + current);
        if (current.rem(2) == 0) {
            sum += current;
        }

        next = last + current;
        last = current;
        current = next;
    }

    println(sum);
}