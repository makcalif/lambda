package com.hacker;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by x239954 on 8/20/2018.
 */
public class RegexTester {

    public static void main(String[] args) {

        String phones = "1-234-234-3433 and (214)324-3434 and 972 234 5343 also (343)324-3434";

        Matcher m = Pattern.compile("[\\(|]?[0-9]{3}\\)").matcher(phones);

        while(m.find()) {

                String inputSeq = m.group();
                System.out.println(inputSeq);

        }

    }

}
