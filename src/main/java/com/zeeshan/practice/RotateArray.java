package com.zeeshan.practice;

import java.util.Arrays;

/**
 *
 * @author ZAhmad
 */
public class RotateArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int k = 4;
        RotateArray obj = new RotateArray();
       // obj.rotateKTimes(arr,k);
        obj.rotateInplace(arr, k);
    }

    private void rotateKTimes(int[] arr, int k) {
        int n = arr.length;
        int ans[] = new int[n];
        
        k = k%n;
        int idx =0;
        for(int i = n-k ; i<n ; i++){
            ans[idx++] = arr[i];
        }
        for(int i =0; i< n-k ; i++){
            ans[idx++] = arr[i];
        }
        
        System.out.println(Arrays.toString(arr));
    }
   private void rotateInplace(int arr[], int k){
       int size = arr.length;
       k = k%size;
       reverse(arr,0,size-k-1);
       reverse(arr,size-k,size-1);
       reverse(arr,0,size-1);
        
        System.out.println(Arrays.toString(arr));
   }

    private void reverse(int[] arr, int left, int right) {
        while(left<right){
            swap(arr,left,right);
            left++;
            right--;
        }
    }

    private void swap(int[] arr, int left, int right) {
        int temp= arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
    
}
