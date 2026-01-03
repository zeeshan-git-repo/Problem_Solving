/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zeeshan.string;

import java.util.stream.Collectors;

/**
 *
 * @author ZAhmad
 */
public class CountVowelConsDig {
    // Count the number of vowels, consonants, digits, and special characters.
    public static void main(String[] args) {
        String str = "azepk21i$@mkw";
        countVowels(str);
        countCharacters(str);
    }

    private static void countVowels(String str) {
        Long count = str.chars().mapToObj((obj)-> (char) obj).filter(c-> c=='a' || c=='e' || c=='i' || c=='o' || c=='u').collect(Collectors.counting());
        System.out.println(count);
    }
    
    private static void countCharacters(String str) {
        str = str.toLowerCase();
        int vowels = 0;
        int consonant = 0;
        int digit = 0;
        int specialChars = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                if ("aeiou".indexOf(ch) != -1) {
                    vowels++;
                } else {
                    consonant++;
                }
            } else if (Character.isDigit(ch)) {
                digit++;
            } else if (!Character.isWhitespace(ch)) {
                specialChars++;
            }
        }
        System.out.println("Vowels : " + vowels);
        System.out.println("Consonant : " + consonant);
        System.out.println("Digit : " + digit);
        System.out.println("Special Chars : " + specialChars);
    }
    
}
