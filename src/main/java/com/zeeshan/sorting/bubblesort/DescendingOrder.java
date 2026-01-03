package com.zeeshan.sorting.bubblesort;

import java.util.Arrays;

public class DescendingOrder {
    public static void main(String[] args) {
        int arr[] = {2,4,6,8};
        bubbleSort(arr);
    }

    private static void bubbleSort(int[] arr) {
        for(int i = 0 ; i< arr.length -1; i++){
            for(int j = 0 ; j<arr.length-i-1; j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
