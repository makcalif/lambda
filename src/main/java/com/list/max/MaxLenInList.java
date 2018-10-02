package com.list.max;

import java.io.*;

public class MaxLenInList {

    public static int getLongestLine(File file) throws IOException {
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
}
