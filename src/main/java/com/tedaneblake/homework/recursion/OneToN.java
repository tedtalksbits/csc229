package com.tedaneblake.homework.recursion;

public class OneToN {
    public void printValues(int n) {
        if(n == 0) {
            return;
        }
        printValues(n - 1);
        System.out.println("printValues(" +(n)+")");
        System.out.println(n);
    }

    public void printValuesTailRecursive(int n, int k) {
        if(n == 0) {
            return;
        }
        System.out.println(k);
        printValuesTailRecursive(n-1, k+1);

    }

    public static void main(String[] args) {
        OneToN oneToN = new OneToN();

        oneToN.printValues(4);
        oneToN.printValuesTailRecursive(4, 1);

    }
}
