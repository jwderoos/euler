class Palindrome {
    fun isPalindrome(input: String): Boolean {
        return input == input.reversed();
    }

    fun isPalindrome(input: Int): Boolean {
        return this.isPalindrome(input.toString());
    }
}

fun main(args: Array<String>) {
    val palindrome : Palindrome = Palindrome();

    for (i in 998001 downTo 50000) {
        if (palindrome.isPalindrome(i)) {
            for (x in 999 downTo 500) {
                if (i.rem(x) == 0) {
                    if (i.div(x).toString().length == 3) {
                        println(" " + i + " / " + x + " = " + i.div(x));
                        return;
                    }
                }
            }
        }
    }
}