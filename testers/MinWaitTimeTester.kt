package challenges.testers

import challenges.minWaitTime

object MinWaitTimeTester {
	private val t1 = listOf(17,4,3)
	private val r1 = 10
	private val t2 = listOf(7)
	private val r2 = 0
	private val t3 = listOf(9,10)
	private val r3 = 9
	private val t4 = listOf(10,9)
	private val r4 = 9
	private val t5 = listOf(1,2,3,4)
	private val r5 = 10
	private val t6 = listOf(4,3,2,1)
	private val r6 = 10
	private val t7 = listOf(5,1,22)
	private val r7 = 7
	private val t8 = listOf(1,1,1,2,1,1,4,1,8,5,6)
	private val r8 = 81
	
	private val tests = listOf(t1,t2,t3,t4,t5,t6,t7,t8)
	private val expected = listOf(r1,r2,r3,r4,r5,r6,r7,r8)
	
	fun run() {
		println("Running minWaitTime tester.")
		var results = mutableListOf<Result>()
		var index = 1
		tests.zip(expected) {a, b -> results.add(buildResult(index++, "queries: ${convertToString(a)}", minWaitTime(a), b))}
		results.forEach {it.print()}
	}
}