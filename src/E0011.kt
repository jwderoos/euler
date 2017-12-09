import java.io.File

fun main(args: Array<String>) {
    val grid = Array(20, {IntArray(20)})
    val file = File("I0011")

    var x = 0
    for (line in file.readLines()) {
        var y = 0;
        for (value in line.split(" ")) {
            grid[x][y] = value.toInt()
            y++
        }
        x++
    }

    var max = 0
    var current = 0
    for (x in 0 until grid.size) {
        for (y in 0 until grid[x].size) {
            if (y < grid[x].size -4) {
                current = grid[x][y] * grid[x][y+1] * grid[x][y+2] * grid[x][y+3]
                if (current > max) {
                    max = current
                }
            }

            if (x < grid.size - 4) {
                current = grid[x][y] * grid[x+1][y] * grid[x+2][y] * grid[x+3][y]
                if (current > max) {
                    max = current;
                }
            }

            if (x < grid.size - 4 && y < grid[x].size - 4) {
                current = grid[x][y] * grid[x+1][y+1] * grid[x+2][y+2] * grid[x+3][y+3]
                if (current > max) {
                    max = current
                }
            }

            if (x < grid.size - 4 && y >= 3) {
                current = grid[x][y] * grid[x+1][y-1] * grid[x+2][y-2] * grid[x+3][y-3]
                if (current > max) {
                    max = current
                }
            }
        }
    }

    println(max)
}
