package com.zeeshan.search.bs;

/**
 *
 * @author ZAhmad
 */
public class RotatedSortedArray {
    public static void main(String[] args) {
        int[] arr= {3,4,5,1,2};
        int target = 2;
        System.out.println(search(arr, target));
    }
    private static int search(int[] arr, int target){
        int start=0, end = arr.length -1;
        int index = -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]<arr[end]){ // it means mid to end is sorted due tp rotated array property
                if(target>arr[mid] && target <= arr[end]){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }
            else{  // start to mid is sorted
                if(target >= arr[start] && target < arr[mid]){
                    end = mid-1;
                } else{
                    start = mid+1;
                }
            }
        }
        return -1;
    }
    
}
