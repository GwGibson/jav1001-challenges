package challenges.testers

import challenges.runLengthEncoding

object runLengthEncodingTester {
	private val t1 = "AAAAAAAAAAAAABBCCCCDDDDDDDDDDD"
	private val r1 = "9A4A2B4C9D2D"
	private val t2 = ";;;;;;;;;;;;''''''''''''''''''''1233333332222211112222111s"
	private val r2 = "9;3;9'9'2'111273524142311s"
	private val t3 = "aAaAaaaaaAaaaAAAABbbbBBBB"
	private val r3 = "1a1A1a1A5a1A3a4A1B3b4B"
	private val t4 = "                          "
	private val r4 = "9 9 8 "
	private val t5 = "1  222 333    444  555"
	private val r5 = "112 321 334 342 35"
	private val t6 = "AAAAAAAAAAAAABBCCCCDD"
	private val r6 = "9A4A2B4C2D"
	private val t7 = "1A2BB3CCC4DDDD"
	private val r7 = "111A122B133C144D"
	private val t8 = "aA"
	private val r8 = "1a1A"
	private val t9 = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
	private val r9 = "9a9a9a9a9a9a9a9a9a9a9a9a9a9a9a9a9a9a9a9a9a9a9a1a"
	
	private val tests = listOf(t1,t2,t3,t4,t5,t6,t7,t8,t9)
	private val expected = listOf(r1,r2,r3,r4,r5,r6,r7,r8,r9)
	
	fun run() {
		println("Running runLengthEncoding tester.")
		var results = mutableListOf<Result>()
		var index = 1
		tests.zip(expected) {a, b -> results.add(buildResult(index++, " $a", runLengthEncoding(a), b))}
		results.forEach {it.print()}
	}
}