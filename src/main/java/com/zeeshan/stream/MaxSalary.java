package com.zeeshan.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author ZAhmad
 */
public class MaxSalary {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, CloneNotSupportedException {
        List<Integer> salaries = Arrays.asList(30000,55000,78000,12000,51000,89000,9837358,200000);
        findMaxSalary(salaries);
        findMinSalary(salaries);
        findNthSalary(salaries);
        MaxSalary obj = MaxSalary.class.newInstance();
        MaxSalary obj2 = new MaxSalary();
        MaxSalary obj3 = (MaxSalary)obj2.clone();
        if(obj==obj2){
            System.out.println("same object");
        }else{
            System.out.println("Not same");
        }
    }

    private static void findMaxSalary(List<Integer> salaries) {
        int highestSalary = salaries.stream().max((a,b)-> Integer.compare(a,b)).get();
        System.out.println("Highest Salary: " + highestSalary);
    }

    private static void findMinSalary(List<Integer> salaries) {
        Optional<Integer> salary = salaries.stream().sorted((a,b)-> Integer.compare(b,a)).skip(1).findFirst();
        System.out.println("Second Highest salary: ");
        salary.ifPresent(System.out::println);
    }
    
    private static void findNthSalary(List<Integer> salaries) {
        Optional<Integer> salary = salaries.stream().sorted((a,b)-> Integer.compare(b,a)).skip(3).findFirst();
        salary.ifPresent(System.out::println);
        
    }
    
}
