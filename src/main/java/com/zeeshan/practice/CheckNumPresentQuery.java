package com.zeeshan.practice;

import java.util.Scanner;

/**
 *
 * @author ZAhmad
 */
public class CheckNumPresentQuery {

    public static void main(String[] args) {
        int arr[] = {5, 66, 8, 44, 11, 32, 70, 63};
        CheckNumPresentQuery obj = new CheckNumPresentQuery();
        obj.checkPresence(arr);        
    }

    private void checkPresence(int arr[]) {
        //int max = Integer.MIN_VALUE;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
        boolean freqArray[] = new boolean[100000];
        for (int num : arr) {
            freqArray[num] = true;
        }
         userQueries(freqArray);
    }

    private void userQueries(boolean[] freqArray) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many times you want to check? ");
        int query = sc.nextInt();
        while (query > 0) {
            //check num
            System.out.println("Enter Number to find");
            int number = sc.nextInt();
            if(freqArray[number]){
                System.out.println("true");
            }else{
                System.out.println("false");
            }
            query--;
        }        
    }

}
