package com.zeeshan.patterns.twopointer;

import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {
        int[] arr = {7,3,6,12}; // after sort {3,6,7,12}
        int target = 9;
        System.out.println(Arrays.toString(findSum(arr,target)));
    }

    public static int[] findSum(int arr[],int target){
        Arrays.sort(arr);
        int first= 0;
        int last = arr.length-1;
        while(first< last){
            if(target==arr[first]+arr[last]){
                return new int[]{first, last};
            }
            else if(target>arr[first]+arr[last]){
                first++;
            } else if(target<arr[first]+arr[last]){
                last--;
            }
        }
        return null;
    }
}
