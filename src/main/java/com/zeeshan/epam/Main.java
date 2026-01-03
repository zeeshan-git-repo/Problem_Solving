package com.zeeshan.epam;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author ZAhmad
 */
public class Main {
    public static void main(String[] args) {
        List<Person> person1 = List.of(new Person("zeeshan", "ahmad", 90000),
                new Person("ahmad", "ahmad", 3000),
                new Person("ash", "ahmad", 6000));
        List<Person> persons = person1.stream().filter((obj) -> obj.getSalary()>50000).sorted(Comparator.comparing(Person::getFirstName)).collect(Collectors.toList());
        persons.forEach(System.out::println);
        
    }
    
}
