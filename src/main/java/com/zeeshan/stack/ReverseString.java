package com.zeeshan.stack;

import java.util.Stack;

/**
 *
 * @author ZAhmad
 */
public class ReverseString {
    // Reverse a String using stack

    private static String reverseString(String str) {
        Stack stack = new Stack();
        String reverseStr = "";
        for (int idx = 0; idx < str.length(); idx++) {
            char ch = str.charAt(idx);
            stack.push(ch);
        }
        while(!stack.isEmpty()){
            Object ch = stack.pop();
            reverseStr = reverseStr + ch ;
        }
        return reverseStr;
    }

    public static void main(String[] args) {
        System.out.println("String is reversed using stack");
        System.out.println(reverseString("Zeeshan"));
    }
}
