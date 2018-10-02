package com.map.aggregate;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AggregateValuesByKey {

    public static int countOfValues() {

        // get counts of all values
        Map<String, List<String>> map = getPopulateMap();
        int countOfValues = map.values().stream()
                .mapToInt(val -> val.size())
                .sum();

        return countOfValues;
    }

    private static Map<String, List<String>> getPopulateMap( ) {
        Map<String, List<String>> map = new HashMap<>();
        map.put("one", Arrays.asList("1"));
        map.put("two", Arrays.asList("1","2"));
        map.put("three", Arrays.asList("1","2","3"));
        map.put("four", Arrays.asList("1","2","3","4"));
        map.put("five", Arrays.asList("1","2","3","4", "5"));
        return map;
    }
}
