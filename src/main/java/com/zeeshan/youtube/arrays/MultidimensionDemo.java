package com.zeeshan.youtube.arrays;

public class MultidimensionDemo {
    public static void main(String[] args) {
        int[][] arr = new int[3][];
        //insert data in 2D array
        int count=1;
        for(int i=0;i<arr.length;i++){
            arr[i] = new int[3];
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] = count++;

            }
        }
        //print 2D array
        for(int j=0;j<arr.length;j++){
            for(int k=0;k<arr[j].length;k++){
                System.out.print(arr[j][k] + "   ");
            }
            System.out.println();
        }
    }
}
