package com.zeeshan.youtube.arrays.binarysearch;

public class CeilingOfNum {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,8,9};
//        int arr1[] = {2,3,5,9,14,16,18};
        int target = 3;
        System.out.println(ceilingOfNum(arr,target));
    }
    public static int ceilingOfNum(int arr[], int target){
        if(arr==null||arr.length==0){
            return -1;
        }
        if(target>arr[arr.length-1]){
            return -1;
        }
        int start =0;
        int end = arr.length-1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                return arr[mid];
            }

        }
        return arr[start];
    }
}
