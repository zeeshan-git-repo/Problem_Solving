package com.zeeshan.stream;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author ZAhmad
 */
public class FindMinMax {
    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(2,5,7,9,10,4);
        Integer num = nums.stream().max((a,b)-> Integer.compare(b,a)).get();
        System.out.println(num);
        
        Integer num2 = nums.stream().min((a,b)-> Integer.compare(b,a)).get();
        System.out.println(num2);
        
        Integer[] arr = nums.stream().toArray(Integer[]::new);
        System.out.println(Arrays.toString(arr));
    }
    
}
