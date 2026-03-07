package com.zeeshan.youtube.arrays.linearsearch;

public class NumbersWithEvenNumberofDigits {

//    https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/

    public static void main(String[] args) {
        int[] arr = {12, 345, 2, 6, 7896};
        System.out.println("Count of numbers with even number of digits: " + countEvenDigits(arr));
    }
    public static boolean evenDigits2(int num) {
        return ((int) Math.log10(num) + 1)%2==0;
    }

    public static int countEvenDigits(int[] arr) {
        int count=0;
        for(int i: arr){
            if(evenDigits2(i)){
                count++;
            }
        }
        return count;
    }
    public static boolean evenDigits(int n){
        int count = 0;
        while(n>0){
            count++;
            n= n/10;
        }
        return count % 2 == 0;
    }

}
