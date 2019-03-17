package com.learn.lambda;

import java.util.Arrays;
import java.util.function.IntBinaryOperator;
import java.util.stream.IntStream;

/**
 * Created by x239954 on 8/9/2018.
 */
public class TestReduce {

    public static void main(String[] args) {
        //reduceWordsToSentence();
        reduceNumbersToSum();
    }

    private static void reduceWordsToSentence() {
        String[] myArray = { "this", "is", "a", "sentence" };
        String result = Arrays.stream(myArray)
                .reduce("", (a,b) -> a + b);
        System.out.println(result);
    }

    private static void reduceNumbersToSum() {
        IntBinaryOperator intBinaryOperator = (a, b) -> a - b;

         int sum = IntStream.range(1, 4)
                .reduce(6, intBinaryOperator);
        System.out.println("sum is:" + sum);
    }


}
