/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zeeshan.arrays;

import java.util.Arrays;

/**
 *
 * @author ZAhmad
 */
public class TwoSumProblem {
    // Input: arr[] = {10, 20, 35, 50}, target =70

    public static void main(String[] args) {
        int arr[] = {20, 20, 10, 50};
        int target = 70;
        sortArray(arr);
        System.out.println(Arrays.toString(arr));
        int[] sum = findTwoSum(arr, target);
        System.out.println("for 0-based array, Indexes are " + Arrays.toString(sum));
    }

    private static int[] findTwoSum(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum < target) {
                left++;
            } else if (sum > target) {
                right--;
            } else if (sum == target) {
                return new int[]{left, right};
            }
        }
        return new int[]{};
    }

    private static void sortArray(int[] arr) {
        //Arrays.sort(arr);
        //mergesort
        divide(arr, 0, arr.length-1);
    }

    private static void divide(int[] arr, int left, int right) {
        System.out.println("divide");
        if (left < right) {
            int mid = left + (right - left) / 2;
            divide(arr, left, mid);
            divide(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        System.out.println("merge");
        int tempArray[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            tempArray[i] = arr[i];
        }

        int start = left, k = start, j = mid+1;
        while (start <= mid && j <= right) {
            arr[k++] = tempArray[start] < tempArray[j] ? tempArray[start++] : tempArray[j++];
        }
        while (start <= mid) {
            arr[k++] = tempArray[start++];
        }
        while (j <= right) {
            arr[k++] = tempArray[j++];
        }
    }
}
