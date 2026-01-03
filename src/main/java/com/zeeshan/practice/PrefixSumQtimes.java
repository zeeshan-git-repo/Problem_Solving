package com.zeeshan.practice;

/**
 *
 * @author ZAhmad
 */
public class PrefixSumQtimes {

    public static void main(String[] args) {
        int arr[] = {0, 2, 4, 1, 3, 6, 5};
        findPrefixSum(arr);
        int left = 5, right = 5;
        if (left <= right) {
            int sum = arr[right] - arr[left - 1];
            System.out.println(sum);
        } else {
            System.out.println("Invalid");
        }

    }

    private static void findPrefixSum(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i];
        }
    }
}
