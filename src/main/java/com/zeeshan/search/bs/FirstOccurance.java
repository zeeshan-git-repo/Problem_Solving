package com.zeeshan.search.bs;

/**
 *
 * @author ZAhmad
 */
public class FirstOccurance {
    public static void main(String[] args) {
        int num = 15;
        int arr[] = {5,5,5,6,7,4};
        FirstOccurance obj = new FirstOccurance();
        System.out.println(obj.firstOccurance(arr, num));
    }
    private int firstOccurance(int arr[], int num){
        int start = 0,  end = arr.length -1;
        int first = -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==num){
                end = mid-1;
                first = mid;
            }
            else if(arr[mid]<num){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return first;
    }
    
}
