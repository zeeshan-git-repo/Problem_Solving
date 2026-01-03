package com.zeeshan.sorting.selectionsort;

import java.util.Arrays;

public class AscendingOrder {
    public static void main(String[] args) {
        int arr[] = {7,4,5,1,2};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr) {
        int length = arr.length;
        for(int i = 0 ; i< length-1; i ++){ // i will represent current index where now we want to store new sorted element
            // find min in unsorted part of array
            int minIndex = i; // we suppose this is min
            for(int j = i+1 ; j<length; j++){ // iterate rest of the array
                if(arr[j]< arr[minIndex]){
                    minIndex = j;
                }
            }
            //swap current element and min element -> current index i will have correct element
            // swap arr[minIndex] and arr[i];
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

}
