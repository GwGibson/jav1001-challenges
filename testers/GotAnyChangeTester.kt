package challenges.testers

import challenges.gotAnyChange

object GotAnyChangeTester {
    private val t1 = listOf(22, 7, 1, 1, 2, 3, 5)
    private val r1 = 20
    private val t2 = listOf<Int>()
    private val r2 = 1
    private val t3 = listOf(1, 1, 1, 1, 1, 1)
    private val r3 = 7
    private val t4 = listOf(2)
    private val r4 = 1
    private val t5 = listOf(1)
    private val r5 = 2
    private val t6 = listOf(1, 5, 1, 1, 1, 10, 15, 20, 100)
    private val r6 = 55
    private val t7 = listOf(6, 4, 5, 1, 1, 8, 9)
    private val r7 = 3
    private val t8 = listOf(109, 2000, 8765, 19, 18, 17, 16, 8, 1, 1, 2, 4)
    private val r8 = 87

    private val tests = listOf(t1, t2, t3, t4, t5, t6, t7, t8)
    private val expected = listOf(r1, r2, r3, r4, r5, r6, r7, r8)

    fun run() {
        println("Running gotAnyChange tester.")
        var results = mutableListOf<Result>()
        var index = 1
        tests.zip(expected) { a, b ->
            results.add(buildResult(index++, "coins: ${convertToString(a)}", gotAnyChange(a), b))
        }
        results.forEach { it.print() }
    }
}
