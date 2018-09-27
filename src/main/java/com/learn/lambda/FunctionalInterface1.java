package com.learn.lambda;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by x239954 on 8/10/2018.
 */
public class FunctionalInterface1 {
    public static void main(String[] args) {
        Map<String, Integer> nameMap = new HashMap<>();
        Integer value = nameMap.computeIfAbsent("John", s -> s.length());
        nameMap.put("David", 3);

        System.out.println(value);

    }
}
