package challenges

/* Write a function that takes in an integer list as a parameter and returns a new list
 * of the same length with the squares of the original integers sorted in ascending order.
 * Verify your code by running SortedSquaresTester.run() in main.
 *
 * Assumptions: The incoming list is sorted in ascending order and not empty.
 * Sample Input:  [2, 3, 5, 7, 9]
 * Sample Output: [4, 9, 25, 49, 81]
 */

fun sortedSquares(list: List<Int>): List<Int> {
    // Create an empty list
    // Add the square values of 2,3,5,7,9 to that list
    
    val result = mutableListOf<Int>()

    val twoSquared = 2*2
    result.add(twoSquared)

    val threeSquared = 3*3
    result.add(threeSquared)

    val fiveSquared = 5*5
    result.add(fiveSquared)

    val sevenSquared = 7*7
    result.add(sevenSquared)

    val nineSquared = 9*9
    result.add(nineSquared)

    return result
}
