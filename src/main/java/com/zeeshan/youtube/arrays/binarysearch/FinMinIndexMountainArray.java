package com.zeeshan.youtube.arrays.binarysearch;

public class FinMinIndexMountainArray {
    // https://leetcode.com/problems/find-in-mountain-array/description/
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 1};
        int target = 3;
        int peak = findPeakMountainArray(arr);
        int idx = findInAsecnding(arr,0,peak-1,target);
        if(idx==-1){
            System.out.println(findInDescending(arr,peak,arr.length-1,target));
        }else{
            System.out.println(idx);
        }

    }
    public static int findPeakMountainArray(int arr[]){
        int start=0;
        int end = arr.length-1;
        while(start<end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
    public static int findInAsecnding(int arr[],int start, int end, int target){
        int index = -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==target) {
                index = mid;
                end = mid - 1;
            }else if(arr[mid] < target) {
                start = mid+1;
            } else{
                end = mid-1;
            }
        }
        return index;
    }

    public static int findInDescending(int arr[],int start, int end, int target){
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==target) {
                return mid;
            }else if(arr[mid] < target) {
                end = mid-1;
            } else{
                start = mid+1;
            }
        }
        return -1;
    }
}
