package com.zeeshan.sorting;

public class MergeSort {
    /**
     * Widely used sorting algorithm
     * Time complexity is O(n log n)
     * Space complexity is O(n)
     * Merge sort is a divide-and-conquer algorithm that divides the input array into two halves,
     * sorts them, and then merges them back together.
     * It is stable and works well for large datasets.
     */
    int tempArray[];
    int length;
    int array[];

    public static void main(String args[]) {
        int arr[] = new int[]{2, 5, 6, 3, 1, 9};
        MergeSort mergeObj = new MergeSort();
        mergeObj.sort(arr);
        for(int val : arr){
            System.out.print(val + ", ");
        }

    }
    private void sort(int arr[]){
        this.array = arr;
        this.length = arr.length;
        this.tempArray = new int[length];
        divide(0, arr.length - 1);

    }
    private void divide(int start, int end){
        if (start < end) {
            int mid = start + (end-start)/2;
            divide(start, mid);
            divide( mid+1, end);
            merge(start, mid, end);
        }
    }

    private void merge(int start, int mid, int end){
        for( int i = start; i <= end; i++){
            tempArray[i] = array[i];
        }
        int i = start, j = mid + 1, k = start;
        while(i<=mid && j <= end){
            array[k++] = (tempArray[i]<=tempArray[j])? tempArray[i++] : tempArray[j++];
            }
        while(i<=mid){
            array[k++] = tempArray[i++];
        }
        while(j<=end){
            array[k++] = tempArray[j++];
        }
    }

}
