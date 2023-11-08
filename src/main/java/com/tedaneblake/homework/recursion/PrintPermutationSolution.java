package com.tedaneblake.homework.recursion;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.swap;

public class PrintPermutationSolution {
    /*
    * Print all permutations of a string
    *
    * Input: s = "ABC"
    * Output: ABC ACB BAC BCA CAB CBA
    *
    * Input: s = "AB"
    * Output: AB BA
    *
    * Input: s = ""
    * Output:
    *
    *
    * */

    void print(String s, int i) {
        List<String> characterList = Arrays.asList(s.split(""));
        //base case:

        if(i == s.length() - 1) {
            return;
        }

        for (int j = i; j < s.length(); j++) {
            characterList.set(i, "d");
            swap(characterList, j, i);
            print(s, i + 1);
            System.out.println(characterList);
            swap(characterList,i, j);
        }


    }

    public static void main(String[] args) {
        PrintPermutationSolution printPermutationSolution = new PrintPermutationSolution();
        printPermutationSolution.print("ABC", 0);
    }
}
