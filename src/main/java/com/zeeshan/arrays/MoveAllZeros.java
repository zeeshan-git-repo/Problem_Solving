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
public class MoveAllZeros {
//    Input: arr[] = [1, 2, 0, 4, 3, 0, 5, 0]
//Output: arr[] = [1, 2, 4, 3, 5, 0, 0, 0]
    
    public static void main(String[] args) {
        int arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
        moveZeroesLeft(arr);
    }

    private static void moveZeroesLeft(int[] arr) {
        int left =0;
        int right = arr.length-1;
        for(int i=0; i< arr.length;i++){
           if(arr[i]!=0){
               int temp = arr[i];
               arr[i] = arr[left];
               arr[left] = temp;
               
               left++;
                       
           }
        }
        
        System.out.println(Arrays.toString(arr));
    }
}
