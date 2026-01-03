/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zeeshan.string;

/**
 *
 * @author ZAhmad
 */
public class CompareStringLogic { // TODO: Must Revise
 //Check if two strings are equal ignoring case and whitespaces.
    public static boolean areEqualIgnoreCaseAndWhitespace(String str1, String str2) {
        if (str1 == null || str2 == null) return false;

        int i = 0, j = 0;

        while (i < str1.length() && j < str2.length()) {
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(j);

            // Skip whitespace in str1
            if (Character.isWhitespace(c1)) {
                i++;
                continue;
            }

            // Skip whitespace in str2
            if (Character.isWhitespace(c2)) {
                j++;
                continue;
            }

            // Compare characters ignoring case
            if (Character.toLowerCase(c1) != Character.toLowerCase(c2)) {
                return false;
            }

            i++;
            j++;
        }

        // Skip remaining whitespace in str1
        while (i < str1.length() && Character.isWhitespace(str1.charAt(i))) {
            i++;
        }

        // Skip remaining whitespace in str2
        while (j < str2.length() && Character.isWhitespace(str2.charAt(j))) {
            j++;
        }

        // If both indices reached the end, strings are equal
        return i == str1.length() && j == str2.length();
    }

    public static void main(String[] args) {
        String s1 = "  Hello World ";
        String s2 = "helloworld";

        boolean result = areEqualIgnoreCaseAndWhitespace(s1, s2);
        System.out.println("Are the strings equal (ignoring case and whitespace)? " + result);
    }
}
