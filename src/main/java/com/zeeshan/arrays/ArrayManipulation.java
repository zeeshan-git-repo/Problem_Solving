package com.zeeshan.arrays;

/**
 *
 * @author ZAhmad
 */
public class ArrayManipulation {

    public static void main(String args[]) {
        int[] arr = {1, 3, 5, 2, 3, 5, 1};
        System.out.println(getUnique(arr));

    }

    private static int getUnique(int[] arr) {
        int s = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;
                }

            }
        }
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                ans = arr[i];
            }
        }
        return ans;
    }

}
