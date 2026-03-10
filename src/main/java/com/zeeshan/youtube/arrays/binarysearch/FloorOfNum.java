package com.zeeshan.youtube.arrays.binarysearch;

public class FloorOfNum {
    public static void main(String[] args) {
        int arr[] = {1,2,8,10,11,12,19};
        int target = 5;
        System.out.println(floorOfNum(arr,target));
    }
    public static int floorOfNum(int arr[], int target){
        if (arr.length == 0 || arr == null) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target<arr[mid]){
                end = mid -1;
            } else if(target>arr[mid]){
                start = mid+1;
            }
            else{
                return arr[mid];
            }
        }
        return arr[end];
    }
}
