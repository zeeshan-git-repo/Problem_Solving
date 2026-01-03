package com.zeeshan.practice;

/**
 *
 * @author ZAhmad
 */
public class SubArrayPrefixSuffixSum {

    public static void main(String[] args) {
        int arr[] = {5, 3, 2, 6, 3, 1};
        System.out.println(equalSumPartition(arr));

    }

    private static boolean equalSumPartition(int[] arr) {
        int totalSum = findSum(arr);
        int prefSum = 0;
        for(int i=0;i<arr.length;i++){
            prefSum += arr[i];
            int suffxSum = totalSum - prefSum;
            if(prefSum == suffxSum){
                System.out.println("Indexes are : " + i + " and " + (i+1));
                return true;
            }
        }
        return false;
        
    }

    static int findSum(int arr[]) {
        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }
        return totalSum;
    }

}
