package com.zeeshan.search.bs;

/**
 *
 * @author ZAhmad
 */
public class Ceiling {
    //find ceiling of a target
   
    public static void main(String[] args) {
      int arr[] = {2,3,5,9,14,16,18};
      int target = 15;
      int start =0;
      int end = arr.length-1;
      System.out.println(findCeiling(arr,target));
      
  }
  private static int findCeiling(int arr[], int target){
      if(target>arr[arr.length-1]){
          return -1;
      }
    int start=0;
    int end = arr.length-1;
    while(start<=end){
      int mid = start + (end-start)/2;
      if(arr[mid]>target){
        end = mid-1;
      } else if(arr[mid]<target){
        start = mid+1;
      } else{
        return mid;
      }
    }
    return arr[start];
  }
}
    