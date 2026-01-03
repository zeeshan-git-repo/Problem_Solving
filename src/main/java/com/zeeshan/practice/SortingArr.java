package com.zeeshan.practice;

import java.util.Arrays;

/**
 *
 * @author ZAhmad
 */
public class SortingArr {
    public static void main(String[] args) {
        int arr[] = {5,6,8,4,0,3};
        int size = arr.length;
        SortingArr sort = new SortingArr();
        System.out.println("Before sorting: " + Arrays.toString(arr));
       // sort.bubbleSort(arr,size);
       // sort.selectionSort(arr,size);
        sort.insertionSort(arr,size);
        System.out.println("After Sorting: " + Arrays.toString(arr));
        
    }

    private void bubbleSort(int[] arr, int size) {
        for(int i = 0; i< size -1; i++){
            boolean swapped = false;
            for(int j=0; j<size-i-1; j++){
                if(arr[j]> arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                return;
            }
        }
        
    }

    private void selectionSort(int[] arr, int size) {
        for(int i =0; i < size-1; i++){
            int min = i;
            for(int j = i+1; j<size ; j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            if(min!=i){
               int temp = arr[i];
               arr[i] = arr[min];
               arr[min] = temp;
            }
            
        }
       
    }

    private void insertionSort(int[] arr, int size) {
      int temp, j;
      for(int i =1; i<size; i++){
          temp = arr[i];
          j = i;
          while(j>0 && arr[j-1] > temp){
              arr[j] = arr[j-1];
              j--;
          }
          arr[j] = temp;
      }
    }
    
}
