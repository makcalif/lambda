package com.thread.mergeresults;

import java.util.Scanner;

public class InputReader {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while(scanner.hasNextLine()) {
            sb.append(scanner.nextLine() + " ");
        };

        String singleLine =
            sb.toString();
        System.out.println(singleLine);

    }
}
