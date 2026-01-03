/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zeeshan.arrays;

/**
 *
 * @author ZAhmad
 */
public class IsTwoSumPresent {
//    Input: arr[] = {10, 20, 35, 50}, target =70
//Output:  Yes
    public static void main(String[] args) {
        int arr[] =  {-8, 1, 4, 6, 10, 45};
        int target = 16;
        System.out.println(findTwoSum(arr,target));
    }

    private static String findTwoSum(int[] arr, int target) {
        int left =0; 
        int right= arr.length-1;
        while(left<right){
            if(arr[left]+arr[right] == target){
                return "Yes";
            }else if(arr[left]+arr[right]> target){
                right --;
            }else if(arr[left]+arr[right]<target){
                left++;
            }
        }
        return "No";
    }
}
