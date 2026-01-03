package com.zeeshan.arrays;

/**
 *
 * @author ZAhmad
 */
public class SecondMaxInt {
    public static void main(String args[]){
//        int arr[] = {2,3,9,8,7};  
        int arr[] = {0,-2,-4,-8,-1};
        findSecondMax(arr);
    }

    private static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int i =0; i<arr.length;i++){
          if(arr[i]>max){
              max = arr[i];
          }  
        }
        return max;
    }

    private static void findSecondMax(int[] arr) {
        int maxNum = findMax(arr);
        for(int i = 0; i<arr.length;i++){
            if(arr[i]==maxNum){
                arr[i]= Integer.MIN_VALUE;
            }
        }
       int secMax = findMax(arr);
        System.out.println("second max is: "+ secMax);
        
    }
    
}
