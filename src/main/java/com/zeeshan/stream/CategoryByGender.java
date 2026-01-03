package com.zeeshan.stream;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CategoryByGender {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("Zeeshan","M");
        map.put("aqsa","F");
        map.put("Ali", "M");
        map.put("Sara", "F");
        map.put("Omar", "M");
        Map<String, List<String>> maps = map.entrySet().stream().collect(Collectors.groupingBy(Map.Entry::getValue, Collectors.mapping(Map.Entry::getKey, Collectors.toList())));
        System.out.println(maps);
    }
}
