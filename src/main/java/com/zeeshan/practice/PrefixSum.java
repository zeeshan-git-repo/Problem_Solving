package com.zeeshan.practice;

import java.util.Arrays;

/**
 *
 * @author ZAhmad
 */
public class PrefixSum {
    public static void main(String[] args) {
        int arr[]= {2,1,3,4,5};
        int pref[] = findPrefixSum(arr);
        System.out.println(Arrays.toString(pref));
        findPrefixSumInPlace(arr);
    }

    private static int[] findPrefixSum(int[] arr) {
        int pref[] = new int[arr.length];
        pref[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            pref[i]= pref[i-1] +arr[i];
        }
        return pref;
    }
    
    private static void findPrefixSumInPlace(int[] arr) {
        for(int i =1;i<arr.length;i++){
            arr[i] = arr[i-1] + arr[i];
        }
        System.out.println(Arrays.toString(arr));
    }
    
}
