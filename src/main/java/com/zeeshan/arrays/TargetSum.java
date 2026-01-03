package com.zeeshan.arrays;

/**
 *
 * @author ZAhmad
 */
public class TargetSum {

    public static void main(String args[]) {
        int arr[] = {4, 6, 3, 5, 8, 2};
        int target = 7;
        TargetSum obj = new TargetSum();
        System.out.println(obj.targetSum(arr, target));
    }

    private int targetSum(int[] arr, int target) {
        int pair = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    pair++;
                }
            }
        }
        return pair;
    }

}
