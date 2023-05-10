package challenges

/* Write a function that takes in a string and returns its run-length encoding.
*
* Wikipedia: "Run-length encoding (RLE) is a form of lossless data compression in which runs of data (sequences in
* which the same data value occurs in many consecutive data elements) are stored as a single data value and count,
* rather than as the original run"

* For example, if you are given the string "GGG", this should be encoded as "3G". Be careful though, a run such as
* "GGGGGGGGGGGGGGG" should not be encoded as "15G" since this leads to an ambiguity when decoding the string. Should the
* decoded string be "1GGGGG" or "GGGGGGGGGGGGGGG"? For long runs of 10 or more characters, the encoding should be split
* such that the aforementioned run is encoded as "9G6G".
* Verify your code by running runLengthEncodingTester.run() in main.
*
* Assumptions: Input strings will not be empty.
* Sample Input:  "aAaAaaaaaAaaaAAAABbbbBBBB"
* Sample Output: "1a1A1a1A5a1A3a4A1B3b4B"
*/

fun runLengthEncoding(string: String): String {
    return string
}
