package challenges.testers

import challenges.threeLargest

object ThreeLargestTester {
	private val t1 = listOf(22,7,15)
	private val r1 = listOf(7,15,22)
	private val t2 = listOf(38,19,-100,289,29, 1,20,49,219)
	private val r2 = listOf(49,219,289)
	private val t3 = listOf(7,7,7,7,7,7,7)
	private val r3 = listOf(7,7,7)
	private val t4 = listOf(7,7,7,7,22,7,7,7,7,7)
	private val r4 = listOf(7,7,22)
	private val t5 = listOf(-1,-2,-3,-7,-22,-17,-543,-8,-7,-7,-77)
	private val r5 = listOf(-3,-2,-1)
	
	private val tests = listOf(t1,t2,t3,t4,t5)
	private val expected = listOf(r1,r2,r3,r4,r5)
	
	fun run() {
		println("Running threeLargest tester.")
		var results = mutableListOf<Result>()
		var index = 1
		tests.zip(expected) {a, b -> results.add(buildResult(index++, "list: ${convertToString(a)}", threeLargest(a), b))}
		results.forEach {it.print()}
	}
}