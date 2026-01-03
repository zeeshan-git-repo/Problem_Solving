/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.zeeshan.sorting;

/**
 *
 * @author ZAhmad
 */
public class SortingAlgo {

    public static void main(String[] args) {
        String str[] = {"ABC", "PLK", "DEF"};
        int size = str.length;
        // bubbleSort(str,size);
        //selectionSort(str, size);
        int arr[] = {2, 5, 6, 3, 1, 9};
        insertionSort(arr,arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
//        for (int i = 0; i < size; i++) {
//            System.out.println(str[i]);
//        }
    }
    // Bubble sort is not efficient for large data sets
    // Time complexity is O(n^2)
    // Space complexity is O(1)
    // Compares adjacent elements, and swaps them if they’re in the wrong order. This process continues until the list is sorted.
    //Educational purposes – it's easy to understand
    // Number of swaps is high


    private static void bubbleSort(String arr[], int size) {
        System.out.println("Sorting using Bubble Sort");
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) { 
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    //Selection Sort sorts an array by repeatedly finding the minimum element from the unsorted portion and putting it at the beginning
    // Time complexity is O(n^2)
    //Good for very small datasets.
    // Number of swaps is low ( at most n swaps)


    private static void selectionSort(String arr[], int size) {
        System.out.println("Sorting using Selection Sort");
        for (int i = 0; i < size - 1; i++) {
            int min = i;
            for (int j = i + 1; j < size; j++) {
                if (arr[min].compareTo(arr[j]) > 0) {
                    min = j;
                }
            }
            String temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    // insertion sort helpful in small size arrays
    // Time complexity is O(n^2)
    // Space complexity is O(1)
    // Insertion Sort builds a sorted array one element at a time. It is much less efficient on large lists than more advanced algorithms such as quicksort, heapsort, or merge sort.
    // When you need a stable sort (it doesn’t change the relative order of equal elements).
    // Example-Sorting [4, 3, 2, 10, 12] using insertion sort:
    //Start with 3, insert before 4 → [3, 4, 2, 10, 12]
    //Take 2, insert before 3 → [2, 3, 4, 10, 12]
    //10 and 12 are already in place → Done!

    private static void insertionSort(int arr[], int size) {
        System.out.println("Sorting using Insertion Sort");
        int temp, j;
        for (int index = 1; index < size; index++) {
            temp = arr[index];
            j = index;
            while (j > 0 && arr[j - 1] > temp) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = temp;
        }
    }

}
