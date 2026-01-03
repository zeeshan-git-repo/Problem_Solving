package com.zeeshan.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ZAhmad
 */
public class WordFrequency {

    public static void main(String[] args) {
        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = {"hit"};
        String[] words = paragraph.split("[ !?',;.]");

        Map<String, Integer> wordFrequencyMap = new HashMap<>();

        for (String word : words) {
            word = word.toLowerCase(); // Convert to lowercase for case-insensitivity
            wordFrequencyMap.put(word, wordFrequencyMap.getOrDefault(word, 0) + 1);
        }
        wordFrequencyMap.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
        
    }
}
