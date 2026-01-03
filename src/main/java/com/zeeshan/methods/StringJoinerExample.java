package com.zeeshan.methods;

import java.util.StringJoiner;

/**
 *
 * @author ZAhmad
 */
public class StringJoinerExample {
    public static void main(String[] args) {
        StringJoiner joiner = new StringJoiner("+",":",":");
        joiner.add("Zeeshan");
        joiner.add("Aqsa");
        joiner.add("Nida");
        joiner.add("Sazia");
        System.out.println(joiner);
    }
    
}
