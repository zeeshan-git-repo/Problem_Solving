/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zeeshan.string;

import java.util.Stack;

/**
 *
 * @author ZAhmad
 */
public class BalancedParenthesis {
     // check parenthesis balanced
    public static void main(String[] args) {
        String str = "{}()()()()[[{(]";
        if(isParenthesisBalanced(str)){
            System.out.println("Balanced");
        }else{
            System.out.println("Not balanced");
        }
    }

    private static boolean isParenthesisBalanced(String str) {
        Stack<Character> stack = new Stack<>();
        for(char ch: str.toCharArray()){
            if(ch=='(' || ch=='{' || ch=='['){
                stack.push(ch);
            }else if(ch==')' || ch=='}' || ch==']'){
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.peek();
                if((top=='(' && ch==')') || (top=='{' && ch =='}') || (top=='[' && ch==']')){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }
        
        return stack.isEmpty();
       
    }
}
