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
public class RemoveOccurance {
//    Input: arr[] = [0, 1, 3, 0, 2, 2, 4, 2], ele = 2
//Output: 5

    public static void main(String[] args) {
        int arr[] = {0, 1, 3, 0, 2, 2, 4, 2};
        int element = 2;
        remainedElement(arr, element);
    }

    private static void remainedElement(int[] arr, int element) {
        int left = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != element) {
                arr[left] = arr[i];
                left++;
            }
        }
        System.out.println(left);
        System.out.println(Arrays.toString(arr));
    }

}
