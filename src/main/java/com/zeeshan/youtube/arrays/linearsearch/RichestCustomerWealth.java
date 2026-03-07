package com.zeeshan.youtube.arrays.linearsearch;

public class RichestCustomerWealth {
    //    https://leetcode.com/problems/richest-customer-wealth/description/
    public static void main(String[] args) {
        int[][] accounts = {{1, 2, 3}, {3, 9, 1}};
        System.out.println(maximumWealth(accounts));
    }

    public static int maximumWealth(int[][] accounts) {
        int sum =0;
        for(int row=0;row<accounts.length;row++){
            int tempSum=0;
            for(int col=0;col<accounts[row].length;col++){
                tempSum += accounts[row][col];
            }
            sum = Math.max(sum,tempSum);
        }
        return sum;
    }

}
