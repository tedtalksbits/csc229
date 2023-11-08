package com.tedaneblake.homework.recursion;

public class BinaryEquivalent {

    /**
     * Returns the binary equivalent of the given integer. By printing the remainder of the integer divided by 2, the binary equivalent is printed in reverse order.
     * @param n the integer to convert
     *
     */

    public void binaryEquivalent(int n) {
        if (n == 0) {
            return;
        }
        binaryEquivalent(n / 2);
        System.out.println(n % 2);
    }

    public static void main(String[] args) {
        System.out.println("Hello, World!");

        BinaryEquivalent binaryEquivalent = new BinaryEquivalent();
        binaryEquivalent.binaryEquivalent(13);

    }
}
