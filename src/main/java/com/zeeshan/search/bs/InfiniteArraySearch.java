package com.zeeshan.search.bs;

/**
 *
 * @author ZAhmad
 */
public class InfiniteArraySearch {
    public static void main(String[] args) {
        //this is testing purpose input but in question infinite array given.
        int arr[] = {3,5,7,9,10,90,100,130,140,160,170};
        int target = 10;
        System.out.println("Index is : " + findRange(arr, target));
        
    }
    private static int findRange(int arr[], int target){
        int start =0;
        int end = 1;
        while(arr[end]<target){
            int temp = end +1;
            end = end + ((end - start +1) *2);
            start = temp;
        }
        return binarySearch(arr,start,end,target);
    }

    private static int binarySearch(int[] arr, int start, int end, int target) {
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]>target){
                end = mid-1;
            }else if(arr[mid]<target){
                start= mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    
}
