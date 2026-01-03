package com.zeeshan.arrays;

import java.util.Scanner;

/**
 *
 * @author ZAhmad
 */
public class QuerySearchInArray {
    public static void main(String[] args) {
        int arr[]={2,5,6,3,8,9};
        int freqArr[] = findFrequency(arr);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of queries: ");
        int query = sc.nextInt();
        while(query>0){
            System.out.println("Enter the number to be searched: ");
            int num = sc.nextInt();
            if(freqArr[num]>0){
                System.out.println("YES");
            }else{
                 System.out.println("NO");
            }
            query--;
        }
        
    }

    private static int[] findFrequency(int[] arr) {
        int freq[] = new int[100000];
        for(int i = 0; i< arr.length;i++){
            freq[arr[i]]++;
        }
        return freq;
    }
    
}
