package com.zeeshan.practice;

/**
 *
 * @author ZAhmad
 */
public class ArrayLastOccur {
    public static void main(String[] args) {
        int arr[] = {4,5,6,2,3,5};
        int target = 7;
        ArrayLastOccur obj = new ArrayLastOccur();
        obj.findLastOccurance(arr,target);
    }

    private void findLastOccurance(int[] arr, int target) {
        int index = -1;
       for(int i = 0; i<arr.length; i++){
           if(arr[i]==target){
               index = i;
           }
       }
        System.out.println("Last Occurance of " + target + " is : " + index);
    }
    
}
