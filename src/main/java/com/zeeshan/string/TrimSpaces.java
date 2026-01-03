/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zeeshan.string;

/**
 *
 * @author ZAhmad
 */
public class TrimSpaces {
    // Trim leading and trailing spaces without using trim().
    public static void main(String[] args) {
        String str = " I am a programmer  ";
        trimString(str);
    }

    private static void trimString(String str) {
        int start=0;
        int end = str.length()-1;
        System.out.println(str.substring(start, end+1));
        while(start<=end && str.charAt(start) ==' '){
            start++;
        }
        while(end>=start && str.charAt(end) == ' '){
            end--;
        }
        System.out.println(str.substring(start, end+1));
    }
    
}
