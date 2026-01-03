package com.zeeshan.practice;

import java.util.Arrays;

/**
 *
 * @author ZAhmad
 */
public class KthSmallestAndLarget {
    public static void main(String[] args) {
        int arr[] = {2,4,6,89,1,0,8,3,7,56,};
        int k = 6;
        Arrays.sort(arr);
        int size = arr.length -1;
        int arr1[] = {arr[0 + (k-1)], arr[size - (k-1)]};
        System.out.println(Arrays.toString(arr1));
    }
    
}
