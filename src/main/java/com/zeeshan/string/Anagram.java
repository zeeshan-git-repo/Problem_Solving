/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zeeshan.string;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 *
 * @author ZAhmad
 */
public class Anagram {
    //Check if two strings are anagrams

    public static void main(String[] args) {
        String s1 = "Listen";
        String s2 = "Silentl";
        boolean status = checkAnagram(s1, s2);
        System.out.println(status);
    }

    private static boolean checkAnagram(String str1, String str2) {
        if (str1.isEmpty() || str2.isEmpty()) {
            return false;
        }
        char[] ch = str1.replaceAll("\\s", "").toLowerCase().toCharArray();
        char[] ch1 = str2.replaceAll("\\s", "").toLowerCase().toCharArray();
        if (ch.length != ch1.length) {
            return false;
        }
        Arrays.sort(ch);
        Arrays.sort(ch1);
//        sort(ch);
//         sort(ch1);
        
        return Arrays.equals(ch, ch1);

    }
    
    private static void sort(char[] ch){
        for(int i=0;i<ch.length;i++){
            boolean swapped = false;
            for(int j=0;j<ch.length -i -1;j++){
                if(ch[j]>ch[j+1]){
                    swap(ch,j,j+1);
                    swapped = true;
                }
            }
            if(!swapped){
                return;
            }
        }
    }
    private static void swap(char[] ch, int left, int right){
        char temp = ch[left];
        ch[left] = ch[right];
        ch[right] = temp;
    }
    
    private static void sorts(char[] ch){
        for(int i=0;i<ch.length;i++){
            int min=0;
            for(int j=i+1;j<ch.length;j++){
                if(ch[min]>ch[j]){
                    min = j;
                }
            }
            char temp = ch[i];
            ch[i] = ch[min];
            ch[min] = temp;
        }
    }

    
}
