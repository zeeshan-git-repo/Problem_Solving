package com.zeeshan.youtube.arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        reverse(arr);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reverse(int[] arr){
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Error: Array cannot be null or empty.");
        }
        int start = 0, end = arr.length -1;
        while(end>start){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
}
