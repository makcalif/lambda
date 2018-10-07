package com.list.sort;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringJoin {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Derek", "Kirk", "Norman");

        String joined = names.stream()
                .collect(Collectors.joining(","));
        System.out.println(String.format("Joined : %s", joined));
    }
}
