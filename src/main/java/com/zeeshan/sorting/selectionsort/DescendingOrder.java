package com.zeeshan.sorting.selectionsort;

import java.util.Arrays;

public class DescendingOrder {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr) {
        int size = arr.length;
        for(int i = 0 ; i < size-1; i++){
            int maxIndex= i;
            for(int j = i+1; j < size; j++){
                if(arr[j]>arr[maxIndex]){
                    maxIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
    }
}
