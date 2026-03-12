package com.zeeshan.youtube.arrays.binarysearch;

public class FindElementInInfiniteArray {
    // Find Position of an element in a sorted array in infinite numbers?
    public static void main(String[] args) {
        System.out.println(findArrayIndex(new int[]{1,2,3,4,5,6,7,8,9,10}, 3));
    }
    public static int findArrayIndex(int[] arr, int target){
        int start = 0;
        int end = 1;
        while(target>arr[end]){
           int tempStart = end +1;
           end = end+ (end-start+1)*2;
           start = tempStart;
        }
        return binarySearch(arr,target,start,end);
    }
    public static int binarySearch(int[] arr, int target, int start, int end){
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==target){
                return mid;
            } else if(arr[mid]>target){
                end = mid-1;
            } else if(arr[mid]<target){
                start = mid+1;
            }
        }
        return -1;
    }
}
