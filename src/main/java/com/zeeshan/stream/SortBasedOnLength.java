package com.zeeshan.stream;

import java.util.Comparator;
import java.util.List;

/**
 *
 * @author ZAhmad
 */
public class SortBasedOnLength {

    public static void main(String[] args) {
        List<String> words = List.of("AA", "BBB", "a");
        Comparator<String> c = (a, b) -> {
            int l1 = a.length();
            int l2 = b.length();
            return Integer.compare(l1, l2);
        };
       // words.stream().sorted(c).forEach(System.out::println);
       
        List<String> word = words.stream().sorted(Comparator.comparingInt(String::length)).toList();
        word.forEach(obj-> System.out.println(obj));
        
        words.stream().sorted((a,b)-> Integer.compare(b.length(), a.length())).forEach(System.out::println);
    }
    
}
