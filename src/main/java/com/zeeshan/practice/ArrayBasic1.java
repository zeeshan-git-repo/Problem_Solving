package com.zeeshan.practice;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 *
 * @author ZAhmad
 */
public class ArrayBasic1 {
    public static void main(String[] args) {
        int arr[] = {2,5,3,5,9};
        int target = 5;
        Map<Integer, Long> collect = Arrays.stream(arr).boxed().filter((num)-> num==target).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        collect.forEach((num,count) -> System.out.println(num +" "+ count));
    }
    
}
