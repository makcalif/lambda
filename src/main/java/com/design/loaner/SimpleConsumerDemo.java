package com.design.loaner;

import java.util.function.Consumer;

public class SimpleConsumerDemo {

    private static Consumer<String> longConsumer = s -> System.out.println(s);
    private static Consumer<String> terseConsumer = System.out::println;

    private static void consumeSomething(Consumer<String> consumer) {
        consumer.accept("string from here");
    }

    public static void main(String[] args) {
        longConsumer.accept("long");
        terseConsumer.accept("terse");

        consumeSomething(s -> {
            System.out.println("length is :" + s.length());
            System.out.println("string is :" + s);
        });
    }
}
