package challenges.testers

import challenges.twoNumSum

object TwoNumSumTester {
	private val t1 = Pair(listOf(22), 7)
	private val r1 = listOf(listOf<Int>()) // hmmm, annoying -> issue with overloading/type erasure
	private val t2 = Pair(listOf(22), 22)
	private val r2 = listOf(listOf<Int>())
	private val t3 = Pair(listOf(3,7), 10)
	private val r3 = listOf(listOf(3,7))
	private val t4 = Pair(listOf(1,2,3,4,5,6,7,8,9,10), 17)
	private val r4 = listOf(listOf(7,10), listOf(8,9))
	private val t5 = Pair(listOf(-7,-5,-3,-1,0,1,3,5,7), -5)
	private val r5 = listOf(listOf(-5,0))
	private val t6 = Pair(listOf(-1,-3,6,4), 3)
	private val r6 = listOf(listOf(-3,6), listOf(-1,4))
	
	private val tests = listOf(t1,t2,t3,t4,t5,t6)
	private val expected = listOf(r1,r2,r3,r4,r5,r6)
	
	fun run() {
		println("Running twoNumSum tester.")
		var results = mutableListOf<Result>()
		var index = 1
	    	tests.zip(expected) {a, b -> results.add(buildResult(index++, "list: ${convertToString(a.first)} | target: ${a.second}",
			twoNumSum(a.first, a.second), b, false))}
		results.forEach {it.print()}
	}
}
