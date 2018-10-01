package com.basic.loop;

import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.function.Consumer;

/**
 * Created by x239954 on 9/28/2018.
 */
public class IterateN {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1, "first");
        map.put(2, "second");
        map.put(6, "sixth");
        map.put(3, "third");
        map.put(4, "fourth");

        /*
        for(Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey());
        }

        for(Integer key: map.keySet()) {
            System.out.println(key);
        }


        for (Integer key: map.descendingKeySet()) {
            System.out.println(key);
        }*/

//        Consumer<Map.Entry<Integer, String>> consumer =  System.out::println;
//        map.entrySet().forEach(consumer);


        //print entry with method ref
        //map.entrySet().forEach(System.out::println);

        // print key without method ref
//        map.entrySet().forEach( x -> {
//            System.out.println(x.getKey());
//        });

            // print keys only using method ref
//        map.entrySet().stream()
//                .map(x -> x.getKey())
//                .forEach(System.out::println);
/*
        // reverse sorted keys
        map.entrySet().stream()
                .map(x -> x.getKey())
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

        // sort by keys if map is not sorted already
        map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(System.out::println);
*/

        //Comparator<Map.Entry> keyComparator = (a, b) -> -1;
//        map.entrySet().stream()
//                .sorted((a, b) -> -1)  // sorts reverse but how?
//                .forEach(System.out::println);

//        map.entrySet().stream()
//                .sorted((a, b) -> -1 * a.getValue().compareTo(b.getValue()))
//                .forEach(System.out::println);

        // custom reverse sorting by key
//        map.entrySet().stream()
//                .sorted((a, b) -> b.getKey() - a.getKey())
//                .forEach(System.out::println);

        // top 2 with sort
//        map.entrySet().stream()
//                .sorted((a, b) -> b.getKey() - a.getKey())
//                .limit(2)
//                .forEach(System.out::println);

        map.entrySet().stream()
                .sorted((a, b) -> b.getKey() - a.getKey())
                .limit(2)
                .forEach( x ->  {
                    System.out.println(x.getValue());
                });
    }
}
