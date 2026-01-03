/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zeeshan.arrays;

import java.util.HashMap;

/**
 *
 * @author ZAhmad
 */
public class AbsoluteDifferencePair {
//    Input: arr[] = [1, 4, 1, 4, 5], k = 3
//Output: 4
    public static void main(String[] args) {
        int arr[] = {1, 4, 1, 4, 5};
        int k =3;
        //countPair(arr,k);
        
        countPairs(arr,k);
    }

    private static void countPair(int[] arr, int k) {
        int count =0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(Math.abs(arr[i]-arr[j]) == 3){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    
    static void countPairs(int[] arr, int k) {
        int n = arr.length;  
        HashMap<Integer, Integer> freq = new HashMap<>();
        int cnt = 0;

        for (int i = 0; i < n; i++) {
          
            // Check if the complement (arr[i] + k)
            // exists in the map. If yes, increment count
            if (freq.containsKey(arr[i] + k)) {
                System.out.println("first if: "+freq.get(arr[i] + k));
                cnt += freq.get(arr[i] + k); 
            }
                
          
            // Check if the complement (arr[i] - k)
            // exists in the map. If yes, increment count
            if (freq.containsKey(arr[i] - k)) {
                System.out.println("second if: "+freq.get(arr[i] - k));
                 cnt += freq.get(arr[i] - k); 
            }
               
          
            // Increment the frequency of arr[i]
            freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1); 
        }
        System.out.println(cnt);
        System.out.println(freq);
    }
}
