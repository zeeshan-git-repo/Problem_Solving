package com.zeeshan.practice;

import java.util.Arrays;

/**
 *
 * @author ZAhmad
 */
public class SortSquaresArray {
    public static void main(String[] args) {
        int arr[] = {-10,-5,-2,1,4,9};
        sortSquares(arr);
    }

    private static void sortSquares(int[] arr) {
        int size = arr.length;
        int left =0;
        int right = size-1;
        int ans[] = new int[size];
        int k =0;
        while(left<=right){
            if(Math.abs(arr[left])> Math.abs(arr[right])){ // since input is on-decreasing that's why this logic works here. Most left or most right can be largest
                ans[k++] = arr[left]*arr[left];
                left++;
            }else{
                ans[k++] = arr[right]* arr[right];
                right--;
            }
        }
        reverseArray(ans);
        System.out.println(Arrays.toString(ans));// ans should be non-decreasing order just like input
    }

    private static void reverseArray(int[] ans) {
        int left =0;
        int right = ans.length-1;
        while(left<right){
            swap(ans,left,right);
            left++;
            right--;
        }
    }

    private static void swap(int[] ans, int left, int right) {
        int temp = ans[left];
        ans[left] = ans[right];
        ans[right] = temp;
    }
    
}
