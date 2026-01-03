/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zeeshan.string;

import java.util.Collections;
import java.util.Optional;
import java.util.TreeSet;

/**
 *
 * @author ZAhmad
 */
public class SecondLargestString {
    public static void main(String[] args) {
        String input = "I am good programmer test me";
        String[] str = input.split(" "); 
        findMaxUsingTreeSet(str);
    }
    
    private static void findMaxUsingTreeSet(String[] str) {
       TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
       for(String word: str){
           set.add(word.length());
       }
       if(set.size()<2){
           System.out.println("Less than two string");
       }
       Optional<Integer> count = set.stream().skip(1).findFirst();
       int second = count.orElse(0);
       for(String word:str){
           if(word.length()==second){
               System.out.println(word);
           }
       }
    }
    
}
