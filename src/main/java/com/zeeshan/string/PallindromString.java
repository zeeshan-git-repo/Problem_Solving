/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zeeshan.string;

/**
 *
 * @author ZAhmad
 */
public class PallindromString {
    // Check if a string is a palindrome.
    public static void main(String[] args) {
        String str = "abcdcba";
        pallindromCheck(str);
        pallindromCheck1(str);
        
    }
    private static void pallindromCheck(String str){
        StringBuilder builder = new StringBuilder(str);
        String revStr = builder.reverse().toString();
        System.out.println(revStr);
        if(str.equals(revStr)){
            System.out.println("Pallindrom");
        }else{
            System.out.println("Not Pallindrom");
        }
    }

    private static void pallindromCheck1(String str) {
        int size = str.length();
        int left =0;
        int right = str.length()-1;
        boolean pallindrom = true;
        while(left<right){
            if(str.charAt(left)!= str.charAt(right)){
                pallindrom = false;
                break;
            }
            left++;
            right--;
        }
        
        
        if(pallindrom){
            System.out.println("String is pallindrom");
        }else{
            System.out.println("String is not pallindrom");
        }
        
    }
    
}
