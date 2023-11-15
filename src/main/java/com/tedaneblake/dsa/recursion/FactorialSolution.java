package com.tedaneblake.dsa.recursion;

public class FactorialSolution {

    int factorial(int n) {

        /*
            Remember that factorial of 5 or 5! = 5*4*3*2*1
         */
        // base case: Handling the inputs for which we cannot break the problem down to smaller sub-problem, for factorial we cannot break down
        // the problem further if the input is 0
        if(n == 0) return 1;

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        FactorialSolution factorialSolution = new FactorialSolution();

        System.out.println(factorialSolution.factorial(5));
    }
}
