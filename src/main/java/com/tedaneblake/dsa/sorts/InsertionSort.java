package com.tedaneblake.dsa.sorts;
/**
 * @author Tedane Blake
 * @version 1.0
 * @since 2023-09-19
 *
 *  This class represents a InsertionSort algorithm.
 */
public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 6, 1, 3};
        insertionSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
    private static void insertionSort(int[] arr) {
        // start 1 from right
        for (int j = 1; j < arr.length; j++) {
            int currInt = arr[j];
            // left
            int i = j - 1;
            while(i >= 0 && arr[i] > currInt) {
                // compare left and right
                arr[i + 1] = arr[i];
                i--;
            }
            arr[i + 1] = currInt;
        }
    }
}
