package com.classWork;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Duplicate {

    public static void main(String[] args) {

        List<Integer> list =
                Arrays.asList(1,2,3,4,5,6,7,8,9,10,10,2,5);

        list.stream()
            .collect(Collectors.groupingBy(i -> i, Collectors.counting()))
            .entrySet()
            .stream()
            .filter(i -> i.getValue() > 1)   
            .map(i -> i.getKey())            
            .forEach(System.out::println);   
    }
}
