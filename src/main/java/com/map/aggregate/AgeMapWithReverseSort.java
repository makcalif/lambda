package com.map.aggregate;


import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AgeMapWithReverseSort {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("John", 10);
        map.put("David", 13);
        map.put("Rich", 33);
        map.put("Shane", 41);
        map.put("Ron", 60);

        // sort entries by age asc
        map.entrySet()
                .stream()
                .sorted(Comparator.comparing(e -> e.getValue())   )
                .forEach(System.out::println);

        //   reverse sort and find eldest person
        map.entrySet()
                .stream()
                .sorted( (e1, e2) -> e2.getValue() - e1.getValue())
                .limit(1)
                .map(e -> e.getKey())
                .forEach(v -> System.out.print(String.format("eldest perosn : %s", v)));

        // find entry with lowest age
        Optional lowest = map.entrySet()
                .stream()
                .min(Comparator.comparingInt(e -> e.getValue()));
        lowest.ifPresent(System.out::println);

        // avg age
         map.entrySet()
                .stream()
                 .mapToInt(e -> e.getValue())
                 .average()
                 .ifPresent(a -> System.out.print(String.format("avg age is : %s", a)));

         // transpose keys to values
        Map<Integer, String> m =map.entrySet().stream()
                .collect(Collectors.toMap(k -> k.getValue(), s -> s.getKey() ));

        System.out.println(m);




    }
}
