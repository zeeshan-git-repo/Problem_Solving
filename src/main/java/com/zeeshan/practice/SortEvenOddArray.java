package com.zeeshan.practice;

import java.util.Arrays;

/**
 *
 * @author ZAhmad
 */
public class SortEvenOddArray {
    public static void main(String[] args) {
        int arr[] = {2,5,7,1,3,8,6,0};
        sortEvenOdd(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sortEvenOdd(int[] arr) {
        int left = 0;
        int right = arr.length -1;
        while(left<right){
            if(arr[left]%2==1 && arr[right]%2==0){
                swap(arr,left,right);
                left++;
                right--;
                        
            }
            if(arr[left]%2==0){
                left++;
            }
            if(arr[right]%2==1){
                right--;
            }
        }
    }

    private static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left]= arr[right];
        arr[right] = temp;
    }
    
}
