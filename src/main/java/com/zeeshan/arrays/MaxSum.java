/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zeeshan.arrays;

/**
 *
 * @author ZAhmad
 */
public class MaxSum {
//    Input  : arr[] = {100, 200, 300, 400}, k = 2
//Output : 700
    public static void main(String[] args) {
        int arr[] = {100, 200, 300, 400};
        int k =2;
        int size = arr.length;
        System.out.println(findMaxSum(arr,size,k));
    }

    private static int findMaxSum(int[] arr,int size,int k) {
       
       if(k>=size){
           System.out.println("Invalid");
           return -1;
       }
       int maxSum=0;
       for(int i=0;i<k;i++){
           maxSum = maxSum + arr[i];
       }
       int windowSum = maxSum;
       for(int i=k;i<size;i++){
           windowSum += arr[i] - arr[i-k];
           maxSum = Math.max(maxSum, windowSum);
       }
       
       return maxSum;
    }   
    
    
}
