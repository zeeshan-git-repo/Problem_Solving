package com.zeeshan.youtube.arrays;

import java.util.Arrays;

public class StoreFiveNum {
    public static void main(String[] args) {
        int[] rollNos = new int[5];
        rollNos[0] = 101;
        rollNos[1] = 102;
        rollNos[2] = 103;
        rollNos[3] = 104;
        rollNos[4] = 105;
        Arrays.stream(rollNos).forEach(System.out::println);
    }
}
