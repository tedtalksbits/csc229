package com.tedaneblake.homework.recursion;

/**
 * The following program recursively prints the value of any as its it passed down and back up the call stack.
 *
 */
public class Fun {
    /**
     * Prints the value of n as it is passed down and back up the call stack.
     * This method will result in the value of n being printed twice, once on the way down the call stack and once as its returned back to its parent caller.
     * @param n the value to print
     */
    public void printValues(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printValues(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Fun fun = new Fun();
        fun.printValues(5);
    }
}
