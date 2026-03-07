package com.zeeshan.youtube.arrays;


public class FindMaximumNum {
    public static void main(String[] args) {
        int arr[] = {1, 2, 87, 4, 5};
        System.out.println(findMax(arr));
    }

    public static int findMax(int arr[]) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
