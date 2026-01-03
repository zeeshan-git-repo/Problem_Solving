package com.zeeshan.practice;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ZAhmad
 */
public class MergeSort {
  
    public static void main(String[] args) {
        int arr[] = {5,9,6,3,0,4,7,3};
        int end = arr.length;
        System.out.println("Before Sorting: " + Arrays.toString(arr));
        MergeSort sort = new MergeSort();
        sort.divide(arr, 0, end-1);
        System.out.println("After Sorting: " + Arrays.toString(arr));
    }   

    private void divide(int[] arr, int start, int end) {
        if(start<end){
           int mid = start + (end-start)/2;
            divide(arr, start, mid);
            divide(arr, mid+1, end);
            merge(arr, start, mid, end);
        }
    }

    private void merge(int[] arr, int start, int mid, int end) {
       int tempArray[] = new int[end+1];
        for(int i =0; i<= end; i++){
            tempArray[i] = arr[i];
        }
        int i = start, j = mid+1, k = start;
        while(i<=mid && j<=end){
            arr[k++] = (tempArray[i]<=tempArray[j])? tempArray[i++]:tempArray[j++];
        }
        while(i<=mid){
            arr[k++] = tempArray[i++];
        }
        while(j<=end){
            arr[k++] = tempArray[j++];
        }
    }
            
    
}
