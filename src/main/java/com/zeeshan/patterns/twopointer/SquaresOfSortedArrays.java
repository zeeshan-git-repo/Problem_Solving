package com.zeeshan.patterns.twopointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SquaresOfSortedArrays {

    // Leetcode : 977. https://leetcode.com/problems/squares-of-a-sorted-array/description/
    public static void main(String[] args) {
//        Input: nums = [-7,-3,2,3,11]
//        Output: [4,9,9,49,121]
        int arr[] = {-7, -3, 2, 3, 11};
//        System.out.println(Arrays.toString(optimizedSorting(arr)));
        System.out.println(Arrays.toString(sortedSquares(arr)));
    }

    public static int[] sortedSquares(int[] nums) {
        List<Integer> negList = new ArrayList<>();
        List<Integer> posList = new ArrayList<>();

        for (int num : nums) {
            if (num < 0) {
                negList.add(num * num);
            } else {
                posList.add(num * num);
            }
        }

        // reverse negative squares
        Collections.reverse(negList);

        int[] resArray = new int[negList.size() + posList.size()];
        int i = 0, j = 0, index = 0;

        while (i < negList.size() && j < posList.size()) {
            if (negList.get(i) < posList.get(j)) {
                resArray[index++] = negList.get(i++);
            } else {
                resArray[index++] = posList.get(j++);
            }
        }
        while (i < negList.size()) resArray[index++] = negList.get(i++);
        while (j < posList.size()) resArray[index++] = posList.get(j++);

        return resArray;
    }

    public static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static int[] optimizedSorting(int[] nums) {
        int[] negArray = Arrays.stream(nums).filter(num -> num < 0).map(num -> num * num).toArray();
        int[] posArray = Arrays.stream(nums).filter(num -> num >= 0).map(num -> num * num).toArray();
        reverseArray(negArray);
        int[] resArray = new int[negArray.length + posArray.length];
        int i = 0, j = 0, index = 0;

        while (i < negArray.length && j < posArray.length) {
            if (negArray[i] < posArray[j]) {
                resArray[index++] = negArray[i++];
            } else {
                resArray[index++] = posArray[j++];
            }
        }
        while (i < negArray.length) {
            resArray[index++] = negArray[i++];
        }
        while (j < posArray.length) {
            resArray[index++] = posArray[j++];
        }
        return resArray;
    }
}
