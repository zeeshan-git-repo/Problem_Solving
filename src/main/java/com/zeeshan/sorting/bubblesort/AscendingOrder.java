package com.zeeshan.sorting.bubblesort;

import java.util.Arrays;

public class AscendingOrder {
    public static void main(String[] args) {
        int arr[] = {6,5,2,1};
        bubbleSort(arr);
    }

    private static void bubbleSort(int[] arr) {
        // n-1 elements are sorted that means last element is already in sorted order
        for(int i = 0; i< arr.length-1; i++){
            boolean swapped = false;
            for(int j = 0; j< arr.length-i-1; j++){
                // last i elements are already at correct sorted positions, so no need to check them So we used (arr.length-i-1)
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;

                }
            }
            if(!swapped){ // if no swapp happened then come out of loop
                return;
            }
        }
//        for(int num : arr){
//            System.out.println(num);
//        }
        //OR
        System.out.println(Arrays.toString(arr));
        //OR
//        Arrays.stream(arr).forEach(System.out::println);

    }
}
