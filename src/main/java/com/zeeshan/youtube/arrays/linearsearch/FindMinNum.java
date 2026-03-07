package com.zeeshan.youtube.arrays.linearsearch;

public class FindMinNum {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 2, 9, 1, 5, 6};
        System.out.println("Minimum number in the array: " + findMin(arr));
//        System.out.println("Minimum number in the array: " + findMin2(arr));
    }
    public static int findMin(int[] arr){
        if(arr == null || arr.length == 0){
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    public static int findMin2(int[] arr){
        if(arr == null || arr.length == 0){
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
