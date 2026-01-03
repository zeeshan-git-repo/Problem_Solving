package com.zeeshan.practice;

import java.util.Arrays;

/**
 *
 * @author ZAhmad
 */
public class SortZerosAndOnes {
    public static void main(String[] args) {
        int arr[] = {1,1,0,0,1,0,1,0,1};
//        sortingArray(arr);
        sortingArrayOptimized(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sortingArray(int[] arr) {
        int countZero = 0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]==0){
                countZero++;
            }
        }
        for(int i =0;i<arr.length;i++){
            if(i<countZero){
                arr[i] = 0;
            } else{
                arr[i] = 1;
            }            
        }
        
    }
    
    private static void sortingArrayOptimized(int arr[]){
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            if(arr[left]==1 && arr[right] == 0){
                swap(arr,left,right); 
                left++;
                right--;
            }
            if(arr[left]==0){
                left++;
            }
            if(arr[right]==1){
                right--;
            }
            
        }
        
    }

    private static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
    
}
