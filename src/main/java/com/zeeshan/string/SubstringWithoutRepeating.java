/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zeeshan.string;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author ZAhmad
 */
public class SubstringWithoutRepeating {

    //find longest substring without repeating chars
   
    public static void main(String[] args) {
        String str = "dgsdjpwiiwq";
        substringWithoutRepeating(str);
    }

    private static void substringWithoutRepeating(String str) {
        Set<Character> set = new HashSet<>();
        int left =0;
        int maxLength=0;
        int start = 0;
        for(int right=0;right<str.length();right++){
            while(set.contains(str.charAt(right))){
                set.remove(str.charAt(left));
                left++;
            }
            set.add(str.charAt(right));
            if(right-left+1>maxLength){
                maxLength = right-left+1;
                start = left;
            }
        }
        System.out.println(str.substring(start, start+maxLength));
    }

}
