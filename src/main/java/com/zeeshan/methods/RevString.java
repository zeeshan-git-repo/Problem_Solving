package com.zeeshan.methods;

/**
 *
 * @author ZAhmad
 */
public class RevString {
    public static void main(String[] args) {
        
        String pallindrom = "This is Zeeshan";
//        reverseWithString(pallindrom);
        reverseWithStringBuilder(pallindrom);       
      
    }
    
    private static void reverseWithStringBuilder(String pallindrom){
      StringBuilder builder = new StringBuilder(pallindrom);
      builder.reverse();
      String str = builder.toString();
      System.out.println(str);
    }
    
    private static void reverseWithString(String pallindrom){
        int len = pallindrom.length();
        char[] tempChar = new char[len];
        char[] charArr = new char[len];
        pallindrom.getChars(0, len, tempChar, 0);
        //reverse
        for(int i =0; i<len ; i++){
            charArr[i] = tempChar[len - 1 - i];
        }
        System.out.println(pallindrom);
        String revString = new String(charArr);
        System.out.println(revString);        
    }
    
}
