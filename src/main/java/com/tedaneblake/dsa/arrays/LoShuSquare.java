package com.tedaneblake.dsa.arrays;

public class LoShuSquare {

        public static void main(String[] args) {
            int[][] loShuSquare = {
                    {4, 9, 2},
                    {3, 5, 7},
                    {8, 1, 6}
            };
            int[][] notLoShuSquare = {
                    {4, 9, 2},
                    {3, 5, 7},
                    {8, 1, 5}
            };
            System.out.println("Is this a Lo Shu Square? " + isLoShuSquare(loShuSquare));
            System.out.println("Is this a Lo Shu Square? " + isLoShuSquare(notLoShuSquare));
        }

        private static boolean isLoShuSquare(int[][] twoDimensionalArr) {
            int sum = 0;
            int[] firstRow = twoDimensionalArr[0];
            for (int k : firstRow) {
                sum += k;
            }
            for (int i = 1; i < twoDimensionalArr.length; i++) {
                int[] row = twoDimensionalArr[i];
                int rowSum = 0;
                for (int k : row) {
                    rowSum += k;
                }
                if (rowSum != sum) {
                    return false;
                }
            }
            for (int i = 0; i < twoDimensionalArr.length; i++) {
                int colSum = 0;
                for (int j = 0; j < twoDimensionalArr[i].length; j++) {
                    colSum += twoDimensionalArr[j][i];
                }
                if (colSum != sum) {
                    return false;
                }
            }
            int diagonalSum = 0;
            for (int i = 0; i < twoDimensionalArr.length; i++) {
                diagonalSum += twoDimensionalArr[i][i];
            }
            if (diagonalSum != sum) {
                return false;
            }
            diagonalSum = 0;
            for (int i = 0; i < twoDimensionalArr.length; i++) {
                diagonalSum += twoDimensionalArr[i][twoDimensionalArr.length - 1 - i];
            }
            return diagonalSum == sum;
        }
}
