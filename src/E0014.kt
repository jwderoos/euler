fun main(args: Array<String>) {
    var maxSteps = (0).toLong()
    var maxValue = maxSteps
    var i = (1).toLong()
    while (i <= 1000000) {
        var steps = (1).toLong()
        var current = i
        while (current > 1) {
            steps++
            if (current.rem(2) <= 0) {
                //even
                //n → n/2 (n is even)
                current = current / 2;
            } else {
                //odd
                //n → 3n + 1 (n is odd)
                current = current * 3 + 1
            }
        }

        if (steps > maxSteps) {
            maxSteps = steps
            maxValue = i
        }

        i++
    }

    println("Longest is " + maxValue + " with " + maxSteps +" steps")
}