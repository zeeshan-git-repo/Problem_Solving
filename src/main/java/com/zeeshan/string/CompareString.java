/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zeeshan.string;

/**
 *
 * @author ZAhmad
 */
public class CompareString {
    //Check if two strings are equal ignoring case and whitespaces.
    public static void main(String[] args) {
        String str1= " I am programmer   ";
        String str2= "I AM    PROGRAMMER";
        compare(str1,str2);
    }

    private static void compare(String str1, String str2) {
       str1 = str1.replaceAll("\\s+", "");
       str2 = str2.replaceAll("\\s+", "");
       if(str1.equalsIgnoreCase(str2)){
           System.out.println("Equals");
       }else{
           System.out.println("Not equals");
       }
    }

}
