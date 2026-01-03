package com.zeeshan.methods;

/**
 *
 * @author ZAhmad
 */
public class DigitsAfterDecimal {
    public static void main(String[] args) {
        String str = printDigits();
        System.out.println(str);
        
    }
    private static String printDigits(){
        String number = "3.28474";
        int idx = number.indexOf(".");
        if(idx<0){
            return "";
        }else{
            return number.substring(idx);
        }
    }
    
}
