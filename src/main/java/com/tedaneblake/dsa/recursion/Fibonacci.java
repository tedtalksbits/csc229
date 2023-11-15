package com.tedaneblake.dsa.recursion;

public class Fibonacci {

    public int fib(int n) {
        // fib(4) 1+2+3+4

        if(n == 0) {
            return 0;
        }

        if(n == 1) {
            return 1;
        }

        return fib(n-1) + fib(n-2);

    }
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        System.out.println(fibonacci.fib(10));
    }
}
