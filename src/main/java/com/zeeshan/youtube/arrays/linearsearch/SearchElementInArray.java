package com.zeeshan.youtube.arrays.linearsearch;

public class SearchElementInArray {
    public static void main(String[] args) {
        int arr[] = {2,6,3,4,5};
        int target = 3;
        System.out.println(linearSearch(arr,target));
    }

    public static int linearSearch(int[] arr,int target){
        if(arr.length==0||arr==null){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
