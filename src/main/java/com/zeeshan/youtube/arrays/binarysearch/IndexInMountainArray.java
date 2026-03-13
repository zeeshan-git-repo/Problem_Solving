package com.zeeshan.youtube.arrays.binarysearch;

public class IndexInMountainArray {
    // https://leetcode.com/problems/peak-index-in-a-mountain-array/
    public static void main(String[] args) {
        int[] arr = {0, 1, 0};
        System.out.println(peakIndexInMountainArray(arr));
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                // we are in descending part of the array, so the peak is to the left (including mid)
                // so we are also considering mid as a potential peak
                end = mid;
            } else {
                // we are in ascending part of the array, so the peak is to the right (excluding mid)
                start = mid + 1;
            }
        }
        return start;
    }
}
