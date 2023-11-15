package com.tedaneblake.dsa.arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class TwoDimensionalArray <T>{

    private T[][] twoDimensionalArr = null;

    public TwoDimensionalArray(T[][] twoDimensionalArr) {
        this.twoDimensionalArr = twoDimensionalArr;
    }

    public T[][] getTwoDimensionalArr() {
        return twoDimensionalArr;
    }

    public TwoDimensionalArray() {
    }

    public void setTwoDimensionalArr(Integer[][] twoDimensionalArr) {
        this.twoDimensionalArr = (T[][]) twoDimensionalArr;
    }

    public String getAllValues() {
        StringBuilder values = new StringBuilder();
        int rows = this.twoDimensionalArr.length;
        for (T[] ints : this.twoDimensionalArr) {
            int cols = ints.length;
            for (T anInt : ints) {
                System.out.println(anInt);
                values.append(anInt);
            }
        }
        return values.toString();
    }

    public String getRowAtIndex(int index) throws Exception {
        StringBuilder values = new StringBuilder();
        arrLengthCheck(index);
        System.out.println("Print out the "+ index + 1 +" row");
        T[] rowValues = twoDimensionalArr[index];
        for (T rowValue : rowValues) {
            System.out.println(rowValue);
            values.append(rowValue);
        }

        return values.toString();
    }

    private void arrLengthCheck(int index) throws Exception {
        if(index > twoDimensionalArr.length) {
            throw new Exception("Index must be between 0 and " + (twoDimensionalArr.length - 1));
        }

    }

    public static void main(String[] args) throws Exception {
        TwoDimensionalArray<Integer> twoDimensionalArray = new TwoDimensionalArray<>();
        Integer[][] table = {{1,2,3}, {4,5,6}};
        twoDimensionalArray.setTwoDimensionalArr(table);
        assertEquals(table, twoDimensionalArray.getTwoDimensionalArr());
        assertEquals("456", twoDimensionalArray.getRowAtIndex(1));
        assertEquals("123456", twoDimensionalArray.getAllValues());
    }
}
