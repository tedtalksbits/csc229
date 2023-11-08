package com.tedaneblake.homework.recursion;

/**
 * @version 1.0
 * Generate Subsets
 * We are given a string on length n, our task is to generate all subsets of the string
 * @Example 1:
 * Input: s = "AB"
 * Output: "", "A", "B", "AB"
 *
 * @Example 2:
 * Input: s = "ABC"
 * Output: "", "A", "B", "C", "AB", "AC", "BC", "ABC"
 * @Note: All characters in the input string are distinct, for a string of length n, there are going to be 2^n subsets
 */
public class GenerateSubstringProblem {

    static void subset(String s, String current, int iterator) {

        // base case
        if(iterator == s.length()) {
            if(current.isEmpty()) System.out.println("\"\"");
            else System.out.println(current);
            return;
        }

        subset(s, current, iterator+1);
        subset(s, current + s.charAt(iterator), iterator + 1);

    }


    /*
    *
    * s = "ABC"
    * current = ""
    * iterator = 0
    * subset("ABC", "", 0 + 1);
    * subset("ABC", "A", 0 + 1);
    * --------------------
    *   * current = ""
    *   iterator = 1
    *   subset("ABC", "", 1 + 1);
    *   subset("ABC", "B", 1 + 1);
    *
    *   * current = "A"
    *   iterator = 1
    *   subset("ABC", "A", 1 + 1);
    *   subset("ABC", "AB", 1 + 1);
    *
    *
    *
    *
    * */

    public static void main(String[] args) {
        subset("ABC", "", 0);
    }
}
