package com.zeeshan.slidingwindow;

/**
 *
 * @author ZAhmad
 */
public class SlidingWindowTechnique {
    public static void main(String[] args) {
        int arr[] = {3,8,2,5,7,6,12};
        int k = 4;
        SlidingWindowTechnique sdt = new SlidingWindowTechnique();
        int sum = sdt.maxSubArray(arr,k);
        System.out.println("Max Subarray: "+ sum);
    }

    private int maxSubArray(int[] arr, int k) {
        int count = 0;
        for(int i=0;i<k;i++){
            count +=arr[i];
        }
        
        int max = count;
        for(int i=1;i<=arr.length-k;i++){
            count = count - arr[i-1] + arr[i+k-1];
            if(count > max){
                max= count;
            }
        }
        return max;
    }
    
}
