package com.zeeshan.epam;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author ZAhmad
 */
public class EmpMain {
    public static void main(String[] args) {
        List<Employee> employees = List.of(new Employee("zee", "lko"),
                new Employee("zak", "delhi"),
                new Employee("amo", "hyd"),
                new Employee("ayu", "lko"),
                new Employee("aqsa", "delhi"),
                new Employee("nida", "hyd")
                );
        Map<String,Long> empMap = employees.stream().collect(Collectors.groupingBy(Employee::getCity,Collectors.counting()));
        empMap.forEach((city,count) -> System.out.println("City: " + city + " " + count));
    }
    
}
