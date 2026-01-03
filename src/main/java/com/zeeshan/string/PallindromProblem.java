/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zeeshan.string;

/**
 *
 * @author ZAhmad
 */
public class PallindromProblem {
//    Input: s = "abba"
//Output: 1
//Explanation: s is a palindrome
    public static void main(String[] args) {
        String str = "abba";
//        boolean isPallindrom = checkPallindrom(str);
//        System.out.println(isPallindrom);
        int left = 0;
        int right = str.length()-1;
        boolean isPallindrom = checkPallindromRecursion(str, left, right);
        System.out.println(isPallindrom);
    }

    private static boolean checkPallindrom(String str) {
        int left = 0;
        int right = str.length()-1;
        System.out.println("Right Index: " + right);
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    private static boolean checkPallindromRecursion(String str, int left, int right) {
       if(left>=right){
           return true;
       }
       if(str.charAt(left)!=str.charAt(right)){
           return false;
       }
       return checkPallindromRecursion(str, left+1, right-1);
    }
    
    
}
