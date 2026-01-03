package com.zeeshan.arrays;

/**
 *
 * @author ZAhmad
 */
public class SwapWithoutTemp {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        swapping(a,b);
    }

    private static void swapping(int a, int b) {
       System.out.println("a: " + a + " b: " + b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("a: " + a + " b: " + b);
    }
    
}
