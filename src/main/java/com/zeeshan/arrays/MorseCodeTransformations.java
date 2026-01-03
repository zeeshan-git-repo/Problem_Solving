package com.zeeshan.arrays;

import java.util.HashSet;
import java.util.Set;

public class MorseCodeTransformations {
    public static void main(String[] args) {
        String[] words = {"gin", "zen", "gig", "msg","abc"};
        System.out.println("Unique transformations count: " + uniqueMorseRepresentations(words));
    }

    public static int uniqueMorseRepresentations(String[] words) {
        String[] MORSE = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---",
                                      "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-",
                                      "..-", "...-", ".--", "-..-", "-.--", "--.."};
        Set<String> transformations = new HashSet<>();

        for (String word : words) {
            StringBuilder transformation = new StringBuilder();
            for (char letter : word.toCharArray()) {
                System.out.println(MORSE[letter]);
                transformation.append(MORSE[letter - 'a']);
            }
            transformations.add(transformation.toString());
        }

        return transformations.size();
    }
}
