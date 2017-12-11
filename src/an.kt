class an {
    companion object {
        fun add(one : String, other : String) : String
        {
            var sum : String = ""
            var carry : Int = 0

            for (i in 0 until other.length) {
                val x = other.reversed()[i].toString().toInt()
                val y = one.reversed()[i].toString().toInt()

                sum += (x + y + carry).rem(10).toString()
                carry = (x + y + carry) / 10
            }

            if (one.length > other.length) {
                val rest = one.reversed().substring(other.length);
                carry += rest.toInt()
            }

            sum += if (carry > 0) carry else ""

            return sum.reversed();
        }
    }
}