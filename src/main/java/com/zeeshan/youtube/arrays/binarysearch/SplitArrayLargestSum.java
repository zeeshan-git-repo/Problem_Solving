package com.zeeshan.youtube.arrays.binarysearch;

public class SplitArrayLargestSum {
    //https://leetcode.com/problems/split-array-largest-sum/description/
    public static void main(String[] args) {
        int[] arr = {7,2,5,10,8};
        int m = 2;
        System.out.println(splitArray(arr,m));
    }
    public static int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;
        for(int num: nums){
            start = Math.max(start,num); // start will be the max element in the array because we can't split an element
            end += num; // end will be the sum of all elements in the array because we can't split the array into more than 1 part
        }
        // here binary search is used to find the minimum largest sum among the k subarrays
        while(start<end){
            int mid = start + (end-start)/2;
            int sum = 0;
            int pieces = 1;
            for(int num: nums){
                if(sum+num>mid){
                    // mid is allowed to be the largest sum among the k subarrays,
                    // if sum+num is greater than mid, then we need to split the array here and start a new subarray,
                    // then sum=num because we are starting a new subarray and pieces++ because we have split the array into one more part
                    sum = num;
                    pieces++;
                } else{
                    // if sum+num is less than or equal to mid, then we can add num to the current subarray
                    sum+=num;
                }
            }
            if(pieces>k){
                start = mid+1;
            } else{
                end = mid;
            }
        }
        // here start and end will be equal because we are looking for the minimum largest sum among the k subarrays, so we can return either start or end
        return end;
    }
}
