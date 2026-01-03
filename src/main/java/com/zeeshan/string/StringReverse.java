/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.zeeshan.string;

/**
 *
 * @author ZAhmad
 */
public class StringReverse {
 //Reverse a string using recursion and iteration.
    public static void main(String[] args) {
       
        String str = "I am a Programmer";
        System.out.println(reverseIteration(str));
        System.out.println(reverseRecursion(str));
        System.out.println(reverseString(str));
    }

    private static String reverseIteration(String str) {

        if (str == null || str.length() <= 1) {
            return str;
        }

        String revString = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            revString += str.charAt(i);
        }
        return revString;
    }

    private static String reverseString(String str) {
        if (str == null || str.length() <= 1) {
            return str;
        }
        char st[] = str.toCharArray();
        int left = 0, right = st.length - 1;
        while (left < right) {
            char ch = st[left];
            st[left] = st[right];
            st[right] = ch;
            left++;
            right--;
        }
        return new String(st);
    }

   

    private static String reverseRecursion(String str) {
        if (str == null || str.length() >= 1) {
            return str;
        }
        return reverseString(str.substring(1)) + str.charAt(0);
    }

}
