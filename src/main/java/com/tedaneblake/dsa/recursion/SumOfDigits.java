package com.tedaneblake.dsa.recursion;

public class SumOfDigits {

    /*
        Remember:
            n%10 = gives you the last digit of n
            n/10 = removes the last digit of n

     */
    public int sum(int n) {
        if(n == 0){
            return 0;
        }
        return sum(n / 10) + n % 10;
    }

    public static void main(String[] args) {
        SumOfDigits sumOfDigits = new SumOfDigits();
        int res = sumOfDigits.sum(253);

        if(res == 10) System.out.println("success");
    }
}
