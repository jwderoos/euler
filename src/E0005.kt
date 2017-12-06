fun main(args: Array<String>) {
    var current: Int = 1;
    var found: Boolean;
    while (true) {
        found = true;
        for (i in 1..20) {

            if (current.rem(i) > 0) {
                found = false;
                break;
            }
        }

        if (found) {
            println(current);
            return;
        }

        current++;
    }
}