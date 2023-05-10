package challenges.testers

import challenges.sortedSquares

object SortedSquaresTester {
    private val t1 = listOf(1, 2, 3, 5, 6, 8, 9, 10)
    private val r1 = listOf(1, 4, 9, 25, 36, 64, 81, 100)
    private val t2 = listOf(1)
    private val r2 = listOf(1)
    private val t3 = listOf(0)
    private val r3 = listOf(0)
    private val t4 = listOf(-1)
    private val r4 = listOf(1)
    private val t5 = listOf(-5, -4, -3, -2, -1)
    private val r5 = listOf(1, 4, 9, 16, 25)
    private val t6 = listOf(-50, -10, -2, -1, 0, 0, 1, 1, 5, 19, 22)
    private val r6 = listOf(0, 0, 1, 1, 1, 4, 25, 100, 361, 484, 2500)
    private val t7 = listOf(0, 0, 0, 0, 0)
    private val r7 = listOf(0, 0, 0, 0, 0)

    private val tests = listOf(t1, t2, t3, t4, t5, t6, t7)
    private val expected = listOf(r1, r2, r3, r4, r5, r6, r7)

    fun run() {
        println("Running sortedSquares tester.")
        var results = mutableListOf<Result>()
        var index = 1
        tests.zip(expected) { a, b ->
            results.add(buildResult(index++, "list: ${convertToString(a)}", sortedSquares(a), b))
        }
        results.forEach { it.print() }
    }
}
