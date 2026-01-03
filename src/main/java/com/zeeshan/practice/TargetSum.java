package com.zeeshan.practice;

/**
 *
 * @author ZAhmad
 */
public class TargetSum {
    public static void main(String[] args) {
        int arr[] = {4,6,2,3,5,8,2};
        int target = 7;
        TargetSum obj = new TargetSum();
        obj.dualPairSum(arr,target);
        obj.tripletPairSum(arr,target);
    }

    private void dualPairSum(int[] arr, int target) {
        int pair = 0;
        for(int i =0; i < arr.length -1; i++){
            for(int j = i+1; j< arr.length ; j++){
                if((arr[i] + arr[j])== target){
                    pair++;
                }
            }
        }
        System.out.println(pair);
    }

    private void tripletPairSum(int[] arr, int target) {
        int pair = 0;
        for(int i =0 ; i< arr.length; i++){
            for(int j = i+1; j< arr.length; j++){
                for(int k = j+1; k< arr.length ; k++){
                    if((arr[i]+arr[j]+arr[k])== target){
                        pair++;
                    }
                }
            }
        }
        System.out.println(pair);
    }
    
}
