package com.zeeshan.search.bs;

/**
 *
 * @author ZAhmad
 */
public class findMinimumIndex {
    public static void main(String[] args) {
        int[] arr = {3,4,5,7,1,2};
        System.out.println("Index is : " + findMin(arr));
    }
    private static int findMin(int[] arr){
        int size = arr.length;
       int start =0, end = size -1;
       int index = -1;
      while(start<=end){
          int mid = start +  (end-start)/2;
          if(arr[mid] <= arr[size-1]){
              index = mid;
              end = mid -1;
          }else{
              start = mid+1;
          }
      }
      return index;
    }
}
