package com.zeeshan.youtube.arrays.linearsearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int target = 5;
        int start = 2;
        int end = 5;
        int result = searchInRange(arr, target, start, end);
        if(result==-1){
            System.out.println("Target not found in the specified range.");
        } else{
            System.out.println("Target found at index: " + result);
        }

    }
    public static int searchInRange(int[] arr, int target, int start, int end) {
        if(arr.length==0||arr==null){
            return -1;
        }
        for(int i=start;i<=end;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
