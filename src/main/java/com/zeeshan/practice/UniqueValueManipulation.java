package com.zeeshan.practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 *
 * @author ZAhmad
 */
public class UniqueValueManipulation {
    public static void main(String[] args) {
        int arr[]={4,2,7,5,2,7,4};
        UniqueValueManipulation obj = new UniqueValueManipulation();
        obj.findUnique(arr);
    }

    private void findUnique(int[] arr) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : arr){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        System.out.println(map);
//        map.keySet().stream().filter(num -> (map.get(num) == 1)).forEach(System.out::println);
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(map.get(entry.getKey()) ==1){
                System.out.println(entry.getKey());
            }
            
        }
    }
}
