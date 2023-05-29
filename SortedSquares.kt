package challenges

/* Write a function that takes in an integer list as a parameter and returns a new list
 * of the same length with the squares of the original integers sorted in ascending order.
 * Verify your code by running SortedSquaresTester.run() in main.
 *
 * Assumptions: The incoming list is sorted in ascending order and not empty.
 * Sample Input:  [2, 3, 5, 7, 9]
 * Sample Output: [4, 9, 25, 49, 81]
 */

// Optimal solution is O(n) time -> not O(nlogn) this is what happens when you sort
fun sortedSquares(list: List<Int>): List<Int> {
    val result = mutableListOf<Int>()

    for (input in list) {
        if (input < 0) {
            // Need to handle things differently if the current input is negative ?
        }
        result.add(input * input);
    }
    // Dennis sorted the list at this point (not ideal)
    return result
}
