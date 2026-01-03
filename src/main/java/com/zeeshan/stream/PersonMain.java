package com.zeeshan.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PersonMain {
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(new Person("Zeeshan","Ahmad",50000),
                new Person("Aqsa","Parveen",60000),
                new Person("John","Cartor",70000));
        List<Person> personStreamedData = getNameAndSalary(personList);
        if(personStreamedData == null){
            System.out.println("Data is null");
        }else{
            personStreamedData.stream().forEach(System.out::println);
        }
    }
    private static List<Person>   getNameAndSalary(List<Person> personList){

        return personList.stream().filter(person -> person.getSalary()>50000).sorted(Comparator.comparing(Person::getFirstName))
                .collect(Collectors.toList());
    }
}
