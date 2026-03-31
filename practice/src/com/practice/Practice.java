package com.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Practice {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(55, 81, 70, 45, 35);

        Integer res = list.stream()
                .sorted(Comparator.reverseOrder()) 
                .skip(3) 
                .findFirst() 
                .orElse(null);

        System.out.println(res);
    }
}