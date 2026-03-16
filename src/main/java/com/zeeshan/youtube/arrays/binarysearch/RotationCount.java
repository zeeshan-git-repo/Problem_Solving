package com.zeeshan.youtube.arrays.binarysearch;

public class RotationCount {
    // Find the rotation count in a rotated sorted array?
    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2, 3,7};
        int pivotIndex = findPivotWithDuplicate(arr);
        System.out.println(pivotIndex+1);
    }
    public static int findPivot(int arr[]){
        int start =0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid> start && arr[mid]<arr[mid-1]){
                return mid-1;
            }if(arr[start]>= arr[mid]){
                end = mid-1;
            } else{
                start = mid+1;
            }
        }
        return -1;
    }
    // What if there are duplicates in the array?? then we will have to check for the duplicates as well
    // if duplicates are present then we can not decide which side is sorted and which is not, so we will have to check both sides
    // duplicate code method will not work if arr does not have duplicates
    public static int findPivotWithDuplicate(int arr[]){
        int start =0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid> start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            // Case 2: duplicates at start, mid, end
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // check start pivot safely
                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                // check end pivot safely
                if (end > start && arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            // Case 3: left side sorted, pivot in right
            else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            }
            // Case 4: pivot in left
            else {
                end = mid - 1;
            }
        }
        return -1;
    }

}
