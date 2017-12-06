class Palindrome {
    fun isPalindrome(input: String): Boolean {
        return input == input.reversed();
    }

    fun isPalindrome(input: Int): Boolean {
        return this.isPalindrome(input.toString());
    }
}
