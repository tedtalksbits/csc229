package com.tedaneblake.dsa.recursion;

public class NToOne {

    public void printValues(int n) {
        if(n == 0) {
            return;
        }
        System.out.println(n);
        printValues(n - 1);
    }

    public static void main(String[] args) {
        System.out.println("Hello, World!");

        NToOne nToOne = new NToOne();
        nToOne.printValues(5);

    }
}
