package com.zeeshan.practice;

import java.util.Arrays;

/**
 *
 * @author ZAhmad
 */
public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,9};
        ReverseArray obj = new ReverseArray();
//        obj.reverseAnArray(arr);
        obj.reverseInPlaceArray(arr);
    }

    private void reverseAnArray(int[] arr) {
        int size = arr.length -1;
        int ans[] = new int[size+1];
        int index = 0;
        for(int i = size ; i>=0; i--){
            ans[index++] = arr[i];
        }        
        System.out.println(Arrays.toString(ans));
    }

    private void reverseInPlaceArray(int[] arr) {
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            swap(arr, left, right);
            left++;
            right--;
        }
        System.out.println(Arrays.toString(arr));
        
    }
    
    private void swap(int arr[], int left, int right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
    }
    
}
