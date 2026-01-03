package com.zeeshan.arrays;

import java.util.Arrays;

/**
 *
 * @author ZAhmad
 */
public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {2,5,1,8,9,0};
//        reverseArray(arr);
//        reverseArrayWithWhile(arr);
        reverseArrayWithoutNewArr(arr);
    }

    private static void reverseArray(int[] arr) {
       int revArr[] = new int[arr.length];
       int j = 0;
       for(int i =arr.length-1;i>=0;i--){
           revArr[j] = arr[i];
           j++;
       }
        System.out.println(Arrays.toString(revArr));
    }
    
    //using while loop
    private static void reverseArrayWithWhile(int[] arr) {
       int revArr[] = new int[arr.length];
       int j = 0;
       int i = arr.length-1;
       while(i>=0){
           revArr[j++] = arr[i];
           i--;
       }
       
        System.out.println(Arrays.toString(revArr));
    }
    //In place reverse
    private static void reverseArrayWithoutNewArr(int[] arr) {
        int i=0, j= arr.length-1;
        while(i<=j){
            swapping(arr,i,j);
            i++;j--;
        }
       
        System.out.println(Arrays.toString(arr));
    }

    private static int[] swapping(int[] arr, int i, int j) {
       int temp = arr[i];
       arr[i]=arr[j];
       arr[j]= temp;
       return arr;
       
    }
    
}
