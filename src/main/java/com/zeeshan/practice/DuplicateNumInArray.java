package com.zeeshan.practice;

import java.util.HashSet;

/**
 *
 * @author ZAhmad
 */
public class DuplicateNumInArray {
    public static void main(String[] args) {
        int arr[] = {1,3,0,5,8,9,1,8,9};
        DuplicateNumInArray obj = new DuplicateNumInArray();
        int duplicate = obj.findDuplicate(arr);
        System.out.println("Using Boolean: " + duplicate);
        int duplicateNum = obj.findDuplicateWithSet(arr);
        System.out.println("Using hashset: " + duplicateNum);
    }

    private int findDuplicate(int[] arr) {
        int max= Integer.MIN_VALUE;
        for(int num:arr){
            if(num > max){
                max = num;
            }
        }
        boolean flag[] = new boolean[max+1];
        for(int num: arr){
            if(flag[num]){
                return num;
            }
            flag[num] = true;
        }
        return -1;
    }
    
    private int findDuplicateWithSet(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for(int num:arr){
            if(set.contains(num)){
                return num;
            }
            set.add(num);
        }
        return -1;
    }
    
}
