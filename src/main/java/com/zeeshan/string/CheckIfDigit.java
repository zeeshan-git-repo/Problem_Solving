/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zeeshan.string;

/**
 *
 * @author ZAhmad
 */
public class CheckIfDigit {
    //  Check if a string contains only digits.
    public static void main(String[] args) {
        String str = "54kj56     ";
        findIfDigit(str);
    }

    private static void findIfDigit(String str) {
        str = str.trim();
        boolean digit = true;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(!Character.isDigit(ch)){
               digit = false;
               break;
            }
        }
        if(digit){
            System.out.println("digit");
        }else{
            System.out.println("No digit");
        }
    }
    
}
