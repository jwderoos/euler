fun main(args: Array<String>) {
    fun calculateRouteNumbers(gridSize: Int) : Long?
    {
        val grid : Array<Long> = Array(gridSize+1, {i -> (1).toLong()})
        for (x in 1..gridSize) {
            for (y in 1 until x) {
                grid[y] = grid[y] + grid[y-1]
            }
            grid[x] = 2 * grid[x - 1]
        }

        return grid.max()
    }

    println(calculateRouteNumbers(20))
}