/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zeeshan.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ZAhmad
 */
public class FindOneOccurance {
    
//    Input: arr[] = [3, 2, 1, 34, 34, 1, 2, 34, 2, 1]
//Output: 3
//Explanation: All elements except 3 occurs thrice in the array.
    
    public static void main(String[] args) {
        int arr[] = {1, 10, 1, 1};
        findNum(arr);
    }

    private static void findNum(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:arr){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        System.out.println(map);
        for(Map.Entry<Integer,Integer> entrySet : map.entrySet()){
            int val = entrySet.getValue();
            if(val==1){
                System.out.println(entrySet.getKey());
            }
        }
    }
}
