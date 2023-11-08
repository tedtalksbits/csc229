package com.tedaneblake.homework.recursion;

public class TowerOfHanoi {
    static void toh(int n, char a, char b, char c){
        // base case
        if(n == 1) {
            System.out.println("Move disc 1 from " + a + " to " + c);
            return;
        }
        // recursively call toh, decrementing n and use c as auxiliary
        toh(n-1, a, c, b);
        // move disc n from A to C
        System.out.println("Move disc " + n + " from " + a + " to " + c);
        // call toh, switch the auxiliary tower to 'a' and the target tower to 'c'
        toh(n-1, b, a, c);
    }

    public static void main(String[] args) {
        toh(3, 'A', 'B', 'C');
    }
}


/*
* toh(3, 'A', 'B', 'C')
* |->  toh(2, 'A', 'B', 'C')
*       |->  toh(1, 'A', 'B', 'C')
*       |    |->  "Move disc 1 from A to C"
*       |->  "Move disc 2 from A to B"
*
*
*
*
*
*
* */