class Product {
    fun product(intArray: IntArray) : Int
    {
        return intArray.fold(1) {acc, i -> acc * i}
    }
}