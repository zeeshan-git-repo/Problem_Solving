package com.zeeshan.practice;

/**
 *
 * @author ZAhmad
 */
public class SwapNumbers {

    public static void main(String[] args) {
        int a = 5;
        int b = 8;
        System.out.println("Before swapping: a = " + a + " b = " + b);
        SwapNumbers obj = new SwapNumbers();
        obj.swapWithTemp(a, b);
        obj.swapWithoutTemp(a, b);

    }

    private void swapWithTemp(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping: a = " + a + " b = " + b);
    }

    private void swapWithoutTemp(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping: a = " + a + " b = " + b);
    }

}
