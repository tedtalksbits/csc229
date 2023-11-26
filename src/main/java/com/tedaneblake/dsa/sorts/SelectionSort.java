package com.tedaneblake.dsa.sorts;

import java.util.Arrays;

public class SelectionSort {

    static void selectionSort(int[] input) {

        for (int i = 0; i < input.length; i++){
            // assign minIndex
            int minIndex = i;

            for (int j = i + 1; j < input.length; j++) {

                // test if minEL (first element) < next element
                int nextEl = input[j];

                if(nextEl < input[minIndex]) {
                    minIndex = j;
                    continue;
                }

            }

            // swap
            // place element at minIndex to first position of the unsorted portion of the array
            int minVal = input[minIndex];
            input[minIndex] = input[i];
            input[i] = minVal;


        }

    }

    public static void main(String[] args) {
        int[] input = {20,12,19,2,4};

        System.out.println(Arrays.toString(input));

        selectionSort(input);

        System.out.println(Arrays.toString(input));
    }


    /*
    *
    * first iteration
    *
    * input: [20,12,19,2,4]
    *
    * minElIndex = 3
    * j = 4
    * nextEl = 4
    * input[minElIndex] = 2
    *
    *
    * minVal = 2
    * [20,12,19,20,4]
    * [2,12,19,20,4]
    *
    * */
}
