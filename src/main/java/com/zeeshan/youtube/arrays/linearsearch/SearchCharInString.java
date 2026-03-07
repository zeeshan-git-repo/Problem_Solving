package com.zeeshan.youtube.arrays.linearsearch;

public class SearchCharInString {
    public static void main(String[] args) {
        String str = "Hello World";
        char target = 'o';
//        System.out.println(searchChar(str, target));
        System.out.println(searchChar2(str, target));

    }
    public static int searchChar(String str, char target){
        if(str==null || str.length()==0){
            return -1;
        }
        char[] characters = str.toCharArray();
        for(int i=0;i<characters.length;i++){
            if(characters[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static int searchChar2(String str, char target){
        if(str==null || str.length()==0){
            return -1;
        }
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==target){
                return i;
            }
        }
        return -1;
    }

}
