
package com.zeeshan.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author ZAhmad
 */
public class MultiplyEachElement {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2,4,5,7,9,22);
        nums.stream().map((num)-> num*2).forEach(System.out::println);
    }
    
}
