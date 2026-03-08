package com.zeeshan.youtube.arrays.binarysearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {10,9,8,7,6,5,4,3,2,1};
        int target = 5;
        System.out.println(searchBS(arr,target));
    }
    public static int searchBS(int[] arr, int target){
        if (arr.length == 0 || arr == null) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        boolean asc = arr[start]<arr[end];
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(asc){
                if(arr[mid]>target){
                    end = mid-1;
                } else if(arr[mid]<target){
                    start = mid+1;
                }
            } else {
                if(arr[mid]>target){
                    start = mid+1;
                } else if(arr[mid]<target){
                    end = mid-1;
                }
            }
        }
        return -1;
    }
}
