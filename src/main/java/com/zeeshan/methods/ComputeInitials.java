package com.zeeshan.methods;

/**
 *
 * @author ZAhmad
 */
public class ComputeInitials {
    
    public static void main(String[] args) {
        String name = "Zeeshan Ahmad";        
        myInitials(name);
    }
    
    public static void myInitials(String name){
        StringBuilder  initials = new StringBuilder();
        for(int idx = 0; idx < name.length();idx++){
            if(Character.isUpperCase(name.charAt(idx))){
                initials.append(name.charAt(idx));
            }
        }
        System.out.println(initials);
    }
    
}
