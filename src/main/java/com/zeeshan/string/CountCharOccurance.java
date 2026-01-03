/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zeeshan.string;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 *
 * @author ZAhmad
 */
public class CountCharOccurance {
    public static void main(String[] args) {
        String str = "I am Indian";
        Map<Character,Long> map = str.toLowerCase().chars().mapToObj(c-> (char) c).filter(c-> c!=' ').collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        map.forEach((k,v)-> System.out.println(k+" "+v));
    }
    
}
