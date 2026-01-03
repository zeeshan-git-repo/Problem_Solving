package com.zeeshan.practice;

/**
 *
 * @author ZAhmad
 */
public class ArrayGreaterValues {

    public static void main(String[] args) {
        int arr[] = {2, 5, 6, 8, 2, 1, 1, 5};
        int target = 5;
        ArrayGreaterValues obj = new ArrayGreaterValues();
        obj.valuesGreaterThan(arr, target);
    }

    private void valuesGreaterThan(int[] arr, int target) {
        int count = 0;
        for(int i=0; i< arr.length; i++){
            if(arr[i]>target){
                count++;
            }            
        }
        System.out.println(count);
    }

}
