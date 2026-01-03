package com.zeeshan.practice;

/**
 *
 * @author ZAhmad
 */
public class TwoDAdditionArray {
    public static void main(String[] args) {
        int arr[][] = {{2,1,3},{9,7,6},{3,7,4}};
         int arr1[][] = {{2,1,3},{9,7,6},{3,7,4}};
        int r1 = arr.length;
        int c1 = arr[0].length;
        int r2 = arr1.length;
        int c2 = arr1[0].length;
        addMatrix(arr,r1,c1,arr1,r2,c2);
    }
    
    private static void addMatrix(int arr[][], int r1, int c1, int arr1[][], int r2, int c2){
        if(r1!=r2 || c1!=c2){
            System.out.println("Wrong input");
            return;
        }
        int sum[][] = new int[r1][c1];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                sum[i][j] = arr[i][j] + arr1[i][j];
            }
        }
        printMatrix(sum);
    }

    private static void printMatrix(int[][] sum) {
       for(int i =0;i<sum.length;i++){
           for(int j=0;j<sum[i].length;j++){
               System.out.print(sum[i][j] + "   ");
           }
           System.out.println();
       }
    }
    
}
