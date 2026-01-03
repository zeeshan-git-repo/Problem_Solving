/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zeeshan.string;

import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 *
 * @author ZAhmad
 */
public class RemoveDuplicate {
    // Remove all duplicate characters from a string
    
    public static void main(String[] args) {
        String str = "I am good programmer test me";
        HashSet<Character> set = new LinkedHashSet<>();
        StringBuilder builder = new StringBuilder();
        for(char ch : str.toCharArray()){
            if(set.add(ch)){
                builder.append(ch);
            }
        }
        
        System.out.println(builder.toString());
    }
    
}
