package com.tedaneblake.dsa.recursion;
/*
*
* You're given a rope of length n, our task is to cut the rope into maximum number of pieces such that every length either of pieces either of a, b, c
* Input: n = 5, a = 2, b = 5, c = 1
* Output: 5 // we make  5 pieces of length 1 each;
*
* Input: n = 23, a = 12, b = 9, c = 11
* Output: 2 // we make 2 pieces of lengths 11 and 12
*
* Input: n = 5, a = 4, b = 2, c = 6
* Output: -1 // no possible cut
*
* Length of every piece (after cuts) should be in set {a, b, c}
* 0 < a, b, c <= n
* */
public class RopeCuttingSolution {

    static int maxPieces(int ropeLen, int lenA, int lenB, int lenC) {
        // base case: if the rope length is 0, return 0
        if(ropeLen == 0) {
            return ropeLen;
        }

        if(ropeLen < 0 ){
            return -1;
        }

        // Check if the cut of length 'a' is valid
        int piecesWithA = (ropeLen >= lenA) ? 1 + maxPieces(ropeLen - lenA, lenA, lenB, lenC) : Integer.MIN_VALUE;

        // Check if the cut of length 'b' is valid
        int piecesWithB = (ropeLen >= lenB) ? 1 + maxPieces(ropeLen - lenB, lenA, lenB, lenC) : Integer.MIN_VALUE;

        // Check if the cut of length 'c' is valid
        int piecesWithC = (ropeLen >= lenC) ? 1 + maxPieces(ropeLen - lenC, lenA, lenB, lenC) : Integer.MIN_VALUE;

        // Return -1 if no valid cut is possible, otherwise return the maximum value
        return Math.max(piecesWithA, Math.max(piecesWithB, Math.max(piecesWithC, -1)));

    }

    public static void main(String[] args) {
        int n1 = 5, a1 = 2, b1 = 5, c1 = 1;
        int n2 = 23, a2 = 12, b2 = 9, c2 = 11;
        int n3 = 5, a3 = 4, b3 = 2, c3 = 6;

        System.out.println("Output for n = 5, a = 2, b = 5, c = 1: " + maxPieces(n1, a1, b1, c1));
        System.out.println("Output for n = 23, a = 12, b = 9, c = 11: " + maxPieces(n2, a2, b2, c2));
        System.out.println("Output for n = 5, a = 4, b = 2, c = 6: " + maxPieces(n3, a3, b3, c3));
    }
}


