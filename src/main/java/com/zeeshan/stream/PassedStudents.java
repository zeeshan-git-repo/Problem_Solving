package com.zeeshan.stream;

import java.util.Arrays;

/**
 *
 * @author ZAhmad
 */
public class PassedStudents {
    public static void main(String[] args) {
        int arr[] = {33,30,29,26,55,89};
        Arrays.stream(arr).boxed().filter((mark)-> mark>=33).forEach(System.out::println);
        System.out.println("########passed with Grace Marks#######");
        Arrays.stream(arr).boxed().filter(num-> num<33).map((num)-> num + 5).forEach(System.out::println);
        long count = Arrays.stream(arr).boxed().filter(i-> i< 33).count();
        System.out.println(count);
        Arrays.stream(arr).boxed().sorted((a,b)-> b.compareTo(a)).forEach(System.out::println); // sort
    }
    
}
