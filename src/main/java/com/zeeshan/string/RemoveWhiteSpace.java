/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zeeshan.string;

/**
 *
 * @author ZAhmad
 */
public class RemoveWhiteSpace {
    // Remove all whitespace from a string.


    public static void main(String[] args) {
        String str = " I am programmer";
        removeSpaces(str);
        removeSpacesBuiltIn(str);
    }

    private static void removeSpaces(String str) {
        String newString = "";
        for(int i=0; i<str.length();i++){
            char ch = str.charAt(i);
            if(!Character.isWhitespace(ch)){
                newString += str.charAt(i);
            }
        }
        System.out.println(newString);
    }
    
    private static void removeSpacesBuiltIn(String str){
        System.out.println(str.replaceAll("\\s+", ""));
    }
    
}
