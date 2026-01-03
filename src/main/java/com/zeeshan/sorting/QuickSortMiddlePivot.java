package com.zeeshan.sorting;

public class QuickSortMiddlePivot {
    /**
     * Quick sort is a divide-and-conquer algorithm that sorts an array by selecting a 'pivot' element
     * and partitioning the other elements into two sub-arrays according to whether they are less than or greater than the pivot.
     * The sub-arrays are then sorted recursively.
     * Time complexity is O(n log n) on average, O(n^2) in the worst case.
     * Space complexity is O(log n).
     */
    public static void main(String[] args) {
        int arr[] = {15,5,6,8,90,6,2,4,5,6,1,2};
        int length = arr.length;
        QuickSortMiddlePivot quickSort = new QuickSortMiddlePivot();
        quickSort.quickSort(arr,0,length-1);
        System.out.println("Sorting using Quick Sort with middle pivot");
        for(int val : arr){
            System.out.print(val + ", ");
        }
    }

    void quickSort(int arr[], int low, int high){
        int index = partition(arr, low, high);
        if(low<index-1){
            quickSort(arr, low, index-1);
        }
        if(index< high){
            quickSort(arr, index, high);
        }
    }
    public int partition( int arr[], int low, int high){
        int pivot = arr[low + (high-low)/2];
        while(low<=high){
            while(arr[low]<pivot){
                low++;
            }
            while(arr[high] > pivot){
                high--;
            }
            if(low<=high){
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;
                high--;
            }
        }
        return low;
    }

}
