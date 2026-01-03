package com.zeeshan.methods;

import java.util.Scanner;

/**
 *
 * @author ZAhmad
 */
public class ReverseString {

    public static void main(String[] args) {
        printRevString();
    }

    private static void printRevString() {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String revName = "";
        int idx = name.length() - 1;
        while (idx >= 0) {
            revName = revName + name.charAt(idx);
            idx--;
        }
        System.out.println(revName);
    }

}
