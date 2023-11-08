package com.tedaneblake.homework.recursion;

public class SumOfNaturalNumbers {

    public int sum(int n) {
        if(n == 0) {
            return 0;
        }

        return n + sum(n - 1);
    }

    public int sumByFormula(int n) {
        return n * (n + 1)/2;
    }

    public static void main(String[] args) {
        SumOfNaturalNumbers sumOfNaturalNumbers = new SumOfNaturalNumbers();
        System.out.println(sumOfNaturalNumbers.sum(5));
        System.out.println(sumOfNaturalNumbers.sumByFormula(5));
    }
}
