package com.zeeshan.arrays;

/**
 *
 * @author ZAhmad
 */
public class SwapNumbers {

    public static void main(String[] args) {
        int a = 3;
        int b = 8;
        swapping(a, b);
    }

    private static void swapping(int a, int b) {
        System.out.println("a: " + a + " b: " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a: " + a + " b: " + b);
    }

}
