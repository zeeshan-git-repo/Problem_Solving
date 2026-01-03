package com.zeeshan.arrays;

/**
 *
 * @author ZAhmad
 */
public class FirstRepeatingVal {
    public static void main(String[] args) {
        int arr[] = {1,2,4,2,6,7,6};
//        findRepeating(arr);
        System.out.println(findRepeating2(arr));
    }

    private static void findRepeating(int[] arr) {
        int repeated = -1;
        L: for(int i = 0; i< arr.length;i++){
           for(int j = i+1;j<arr.length;j++){
               if(arr[i]==arr[j]){
                   repeated = arr[i];
                   break L;
               }
           }
       }
        System.out.println(repeated);
    }
    
    private static int findRepeating2(int[] arr) {
        
        for(int i = 0; i< arr.length;i++){
           for(int j = i+1;j<arr.length;j++){
               if(arr[i]==arr[j]){
                   return arr[i];
               }
           }
       }
       return -1;
    }
    
}
