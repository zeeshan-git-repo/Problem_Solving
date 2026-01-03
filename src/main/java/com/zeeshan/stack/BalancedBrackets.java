package com.zeeshan.stack;

import java.util.Stack;

/**
 *
 * @author ZAhmad
 */
public class BalancedBrackets {

    private static boolean isBalanced(String brackets) {
        Stack stack = new Stack();
        for(int idx = 0; idx<brackets.length() ; idx++){
            char ch = brackets.charAt(idx);
            if(ch == '(' || ch== '{' || ch == '['){
                stack.push(ch);
            } else if(ch == ')' || ch== '}' || ch == ']'){
                if(stack.isEmpty()){
                    return false;
                }
                Object top = stack.pop();
                System.out.println("TOP: "+ top);
                if(!isMatching((char)top, ch)){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private static boolean isMatching(char open, char close) {
        if (open == '(' && close == ')') {
            return true;
        } else if (open == '{' && close == '}') {
            return true;
        } else return open == '[' && close == ']';
    }

    public static void main(String[] args) {
        System.out.println(isBalanced("([]){}{{}}{{]{)"));
    }

}
