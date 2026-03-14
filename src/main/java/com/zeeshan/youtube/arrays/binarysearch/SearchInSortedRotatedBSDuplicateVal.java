package com.zeeshan.youtube.arrays.binarysearch;

public class SearchInSortedRotatedBSDuplicateVal {
    // https://leetcode.com/problems/search-in-rotated-sorted-array/
    // for duplicate values, we cannot decide which part is sorted, so we will skip the duplicates
    public static void main(String[] args) {
        int arr[] = {1,1,1,7,1,7,1,1};
        int target = 7;
        System.out.println(search(arr,target));
    }
    public static int search(int arr[], int target){
        int pivot = findPivot(arr);
        System.out.println("Pivot Index: "+ pivot);
        if(pivot==-1){
            return binarySearch(arr,target,0,arr.length-1);
        }
        if(arr[pivot]==target){
            return pivot;
        }
        if(target>=arr[0]){
            return binarySearch(arr,target,0,pivot-1);
        }
        return binarySearch(arr,target,pivot+1,arr.length-1);
    }
    public static int binarySearch(int[] arr, int target, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid; // found
            }

            // If duplicates are present, skip them
            if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
                start++;
                end--;
            }
            // Left half is sorted
            else if (arr[start] <= arr[mid]) {
                if (target >= arr[start] && target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            // Right half is sorted
            else {
                if (target > arr[mid] && target <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1; // not found
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
            }
            // if elements at middle, start and end are equal then just skip the duplicates
            if(arr[mid] == arr[start] && arr[mid] == arr[end]){
                // skip the duplicates
                // NOTE: what if these elements at start and end were the pivot??
                // check if start is pivot
                if(arr[start]> arr[start+1]){
                    return start;}
                start++;
                // check if end is pivot
                if(arr[end]< arr[end-1]){
                    return end-1;}
                end--;
            } // left side is sorted , so pivot should be in right
            else if(arr[start]< arr[mid] || (arr[start] == arr[mid] && arr[mid]> arr[end])){
                start = mid+1;
            } else{
                end = mid-1;
            }
        }
        return -1;
    }
}
