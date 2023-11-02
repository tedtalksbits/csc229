package com.tedaneblake.homework.recursion;

public class Fun {

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
    }
}
