package com.zeeshan.youtube.arrays;

public class FindMaximumNum {
    public static void main(String[] args) {

        int[] arr4 = {-5, 10, -20, 50, 30};
        System.out.println("Mixed numbers: " + findMax(arr4));

        try {
            int[] arr10 = {};
            System.out.println("Empty array: " + findMax(arr10));
        } catch (IllegalArgumentException e) {
            System.out.println("Empty array error: " + e.getMessage());
        }
    }

    public static int findMax(int[] arr) {

        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Error: Array cannot be null or empty.");
        }

        if (arr.length == 1) {
            return arr[0];
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
