package challenges.testers

import kotlin.jvm.Throws

internal class Result {
	// A dataclass to hold these values might be nice
	private val testNo: Int
	private val input: String
	private val output: String?
	private val expected: String?
	private val passed: Boolean
	
	@Throws constructor(testNo: Int, input: String, output: String?, expected: String?) {
		// This throw is debatable but I wanted to have it here for demonstration purposes
		if (testNo < 1) throw IllegalArgumentException("A test number of $testNo is invalid. The test number should be >= 1.")
		this.testNo = testNo
		this.input = input
		this.output = output
		this.expected = expected
		passed = (output == null) 
	}
	
	@Throws constructor(testNo: Int, input: String): this(testNo, input, null, null)
	
	fun print() {
		val resultString = if (passed) "Test $testNo: PASSED - Input: $input" 
		                   else "Test $testNo: FAILED - Input: $input \n\tExpected Output: $expected \n\tYour Output:     $output"
		IOHelper.print(resultString, passed)
	} 
	
	private companion object IOHelper {
		const val colorRed = "\u001B[31m"
		const val colorReset = "\u001B[0m"
		const val colorGreen = "\u001B[32m"
			
		@JvmStatic
		fun print(input: String, passed: Boolean) {
			val color = if (passed) colorGreen else colorRed
			println(color + "$input" + colorReset)
		}
	}
}

@JvmName("BuildResultBase")
internal fun <T: Comparable<T>> buildResult(testNo: Int, input: String, output: T, expected: T): Result {
		return if (output.equals(expected)) Result(testNo, input)
		   else Result(testNo, input, output.toString(), expected.toString())
}

@JvmName("buildResultWithLists")
internal fun <T: Comparable<T>> buildResult(testNo: Int, input: String, output: List<T>, expected: List<T>, ordered: Boolean=true): Result {
	return if (verify(output, expected, ordered)) Result(testNo, input)
		   else Result(testNo, input, convertToString(output), convertToString(expected))
}

@JvmName("buildResultMultipleExpected")
internal fun <T: Comparable<T>> buildResult(testNo: Int, input: String, output: List<T>, expected: List<List<T>>, ordered: Boolean=true): Result {
	for (list in expected) {
		if (verify(output, list, ordered)) {
			return Result(testNo, input)
		}
	}
	return Result(testNo, input, convertToString(output), convertToString(expected))
}

private fun <T: Comparable<T>> verify(output: List<T>, expected: List<T>, ordered: Boolean): Boolean {
	return if (ordered) output.equals(expected)
	       else output.count() == expected.count() && output.containsAll(expected)
}

@JvmName("convertListofListsToString")
private fun <T> convertToString(lists: List<List<T>>): String {
	val sb = StringBuilder()
	if (lists.count() > 1) {
		sb.append("Any of the following: ")
	}
	for (list in lists) {
		sb.append("${convertToString(list)}, ")
	}
	return sb.toString().dropLast(2)
}

internal fun <T> convertToString(list: List<T>): String {
	return '[' + list.joinToString() + ']'
}