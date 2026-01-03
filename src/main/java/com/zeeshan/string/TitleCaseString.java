/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zeeshan.string;

/**
 *
 * @author ZAhmad
 */
public class TitleCaseString {
    // Convert string to title case (first letter capital).
    public static void main(String[] args) {
        String str="i am programmer";
        titleCase(str);
    }

    private static void titleCase(String str) {
       String[] words = str.split(" ");
       StringBuilder builder = new StringBuilder();
       for(String word: words){
           if(!word.isEmpty()){
               builder.append(Character.toUpperCase(word.charAt(0)))
                       .append(word.substring(1).toLowerCase()).append(" ");
           }
           
       }
        System.out.println(builder.toString().trim());
    }
    
    
   
}

