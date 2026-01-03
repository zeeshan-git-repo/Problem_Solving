package com.zeeshan.practice;

import java.util.Arrays;

/**
 *
 * @author ZAhmad
 */
public class ArraySmallAndLarge {
    public static void main(String[] args) {
        int arr[] = {5,4,6,9,1,0,3};
        Arrays.sort(arr);
        int arr1[] = {arr[0], arr[arr.length-1]};
        System.out.println(Arrays.toString(arr1));
    }
    
}
