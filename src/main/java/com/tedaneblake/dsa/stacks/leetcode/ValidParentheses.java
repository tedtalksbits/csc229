package com.tedaneblake.dsa.stacks.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ValidParentheses {
    static boolean isValid(String s) {

        // transform the string into an array of chars
       char[] charArr = s.toCharArray();

        // initialize an array stack
        List<Character> stack = new ArrayList<>();

        // loop through each element in the char array
        for (char currChar : charArr) {
            if (stack.size() > 0) {
                // pointer to last element the stack index
                int lastI = stack.size() - 1;
                // check top element (aka last element in the array)
                if (stack.get(lastI) == '(' && currChar == ')') {
                    // found matching pair
                    stack.remove(lastI);
                } else if (stack.get(lastI) == '[' && currChar == ']') {
                    // found matching pair
                    stack.remove(lastI);
                } else if (stack.get(lastI) == '{' && currChar == '}') {
                    // found matching pair
                    stack.remove(lastI);
                } else {
                    // no matching pair found add it to top (aka last element of the array)
                    stack.add(currChar);
                }

            } else {
                // if the stack is empty, add the current element to the top
                stack.add(currChar);
            }
        }

        return stack.isEmpty();

    }

    public static void main(String[] args) {

//        System.out.println(isValid("()"));
        System.out.println(isValid("()[]{{"));
    }
}
