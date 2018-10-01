package com.design.decorator;

import java.util.List;
import java.util.function.Function;

public class Calculator {

    public static Function<Integer, Integer> increment = e -> e+1;
    public static Function<Integer, Integer> doubler = d -> d*2;
    public static Function<Integer, Integer> squarer = d -> (int) Math.round(Math.pow(d, 2));

    public void doMultipleOps(int num, List<Function> functions) {

    }

    public static int doWork(int value, Function<Integer, Integer> function) {
        return function.apply(value);
    }
}
