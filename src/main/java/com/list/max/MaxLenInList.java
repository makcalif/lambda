package com.list.max;

import java.io.*;
import java.util.Comparator;

public class MaxLenInList {

    public static int getLongestLineLength(File file) throws IOException {
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

//        bufferedReader.lines()
//                .forEach(l -> System.out.printf("%d : %s\n", l.length(), l));

        int i= bufferedReader.lines()
                .mapToInt(String::length)
                .max()
                .getAsInt();
        return i;
    }

    public static String getLongestLineApproach1(File file) throws IOException {
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String longest = bufferedReader.lines()
                .reduce((x, y) -> x.length() > y.length() ? x : y)
                .get();
        return longest;
    }

    public static String getLongestLineApproach2(File file) throws IOException {
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String longest = bufferedReader.lines()
                .max(Comparator.comparingInt(String::length))
                .get();
        return longest;
    }
}
