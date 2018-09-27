package com.learn.lambda;

import java.util.Arrays;

/**
 * Created by x239954 on 8/9/2018.
 */
public class TestReduce {

    public static void main(String[] args) {
        String[] myArray = { "this", "is", "a", "sentence" };
        String result = Arrays.stream(myArray)
                .reduce("", (a,b) -> a + b);
        System.out.println(result);
    }
}
