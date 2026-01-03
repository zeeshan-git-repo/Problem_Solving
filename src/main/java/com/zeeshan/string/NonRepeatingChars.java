/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zeeshan.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author ZAhmad
 */
public class NonRepeatingChars {
    // Find the first non-repeating character in a string.
    public static void main(String[] args) {
        String s1 = "jasij fhia";
        char ch = findNonRepeatedChars(s1);
        System.out.println(ch);
    }

    private static Character findNonRepeatedChars(String s1) {
       s1 = s1.trim().toLowerCase();
        HashMap<Character,Integer> maps = new LinkedHashMap<>();
        for(char ch: s1.toCharArray()){
            maps.put(ch, maps.getOrDefault(ch, 0)+1);
        }
        for(Map.Entry<Character,Integer> entry : maps.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey();
            }
        }
        return null;
    }
    
}
