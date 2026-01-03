package com.zeeshan.search.bs;

/**
 *
 * @author ZAhmad
 */
public class FindElementInRotatedArray {
    public static void main(String[] args) {
        int[] arr = {0,0,0,1,1,1,2,0,0,0};
        int target = 2;
        System.out.println(findElement(arr,target));
    }
    // here due to duplicate elements arr[mid], arr[start], arr[end] all these equality will failed so we will apply other algorithm
    // to find in duplicate rotated sorted array, distinct elements algorithm need some tweeks.

    private static boolean findElement(int[] arr, int target) {
        int start =0, end = arr.length -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target == arr[mid]){
                return true;
            }
            
            // In case of duplicate elements
            if(arr[start] == arr[mid] && arr[end] == arr[mid]){
                ++start;
                --end;
            }
            
            
            else if(arr[mid] <= arr[end]){ // mid to end is sorted
                if(target > arr[mid] && target <= arr[end]){
                    start =  mid+1;
                }else{
                    end = mid -1;
                }
            }else{ // start to mid is sorted
                if(target >= arr[start] && target < arr[mid]){
                    end = mid -1;
                }else{
                    start = mid+1;
                }
            }
            
        }
        return false;
    }
    
}
