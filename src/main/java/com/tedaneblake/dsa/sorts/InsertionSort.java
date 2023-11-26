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
        int[] arr = {31, 41, 59, 26, 41, 58};
        insertionSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
        insertionSortDesc(arr);
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

    public static void insertionSortDesc(int[] arr) {

        // iterate over arr starting from index 1
        for (int i = 0; i < arr.length; i++){
            // initialize current value
            int currValue = arr[i];
            // iterate over previous values
            // initial left point
            int leftP = i - 1;
             // while current value > prev values
            while(leftP >= 0 && arr[leftP] < currValue){

                // shift greater values in place
                arr[leftP + 1] = arr[leftP];

                leftP--;
            }

            arr[leftP + 1] = currValue;

        }
    }

    /*
    * arr = {5, 2, 4, 6, 1, 3};
    * j = 1
    * i = 0
    * currInt = 2
    * arr[i] = 5
    * arr[i+1] = 2
    *
    *
    *
     */
}
