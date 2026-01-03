/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zeeshan.arrays;

import java.util.Arrays;

/**
 *
 * @author ZAhmad
 */
public class FindMissingFromSeries {
//    Input: arr[] = [8, 2, 4, 5, 3, 7, 1]
//Output: 6
//Explanation: All the numbers from 1 to 8 are present except 6.
    public static void main(String[] args) {
        int arr[] = {8, 2, 4, 5, 3, 7, 1};
        findMissing(arr);
        findMissingBetter(arr);
    }

    private static void findMissing(int[] arr) {
      // int size = arr.length;
      Arrays.sort(arr);
       int count =1;
       int missingNum = 0;
       for(int i=0;i<arr.length;i++){
           if(count==arr[i]){
               count++;
           }else{
               missingNum = count;
               break;
           }
       }
        System.out.println("Using Naive Approach");
        System.out.println(missingNum);
    }

    private static void findMissingBetter(int[] arr) {
        System.out.println("Using Better Approach");
        long arrSum = 0;
        for (int i = 0; i < arr.length; i++) {
            arrSum = arrSum + arr[i];
        }
        System.out.println(arrSum);
        int n = arr.length + 1;
        long totalsum = n * (n + 1) / 2;
        System.out.println(totalsum);
        long missingNum = totalsum - arrSum;

        System.out.println(missingNum);
    }
}
