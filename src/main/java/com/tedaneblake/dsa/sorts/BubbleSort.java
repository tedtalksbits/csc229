package com.tedaneblake.dsa.sorts;

import java.util.Arrays;

public class BubbleSort {

    /**
     * Bubble Sort Algorithm
     *
     * Bubblesort is a popular, but inefficient, sorting algorithm. It works by repeatedly
     * swapping adjacent elements that are out of order. The procedure BUBBLESORT
     * sorts array A[1:n] .
     * @param input int[]
     * <p>
     * 1. Start at the beginning of the array
     * <p>
     * 2. Compare the first 2 elements, if the first is greater than the second, swap them
     * <p>
     * 3. Move to the next pair of element and repeat step 2.
     * <p>
     * 4. Continue until the of the array
     * <p>
     * 5. Repeat the process for each element in the array
     *
     *
     */

    static void bubbleSort(int[] input) {

        int i = input.length - 1;

       while (i >= 0) {

            for (int j = 0; j < i; j++) {
                if(input[j] > input[j + 1]){
                    int temp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = temp;
                }
            }
            i--;
       }

    }

    public static void main(String[] args) {
        int [] input = {3,2,5,1,1,4};
        bubbleSort(input);
        System.out.println(Arrays.toString(input));
    }

}
