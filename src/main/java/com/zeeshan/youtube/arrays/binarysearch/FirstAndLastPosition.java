package com.zeeshan.youtube.arrays.binarysearch;

import java.util.Arrays;

public class FirstAndLastPosition {
//    https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
    public static void main(String[] args) {
        int arr[] = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int result[] = searchRange(arr, target);
        System.out.print(Arrays.toString(result));
    }
    public static int[] searchRange(int[] arr, int target){
        return new int[] {findFirst(arr,target),findLast(arr,target)};
    }

    public static int findFirst(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int first = -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==target){
                first = mid;
                end = mid-1;
            } else if(arr[mid]>target){
                end = mid-1;
            } else if(arr[mid]<target){
                start = mid+1;
            }
        }
        return first;
    }
    public static int findLast(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int last = -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==target){
                last = mid;
                start = mid+1;
            } else if(arr[mid]>target){
                end = mid-1;
            } else if(arr[mid]<target){
                start = mid+1;
            }
        }
        return last;
    }



}
