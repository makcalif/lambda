package com.map.util;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapUtil {

    public static Map<String, List<String>> getStringKeyValuesList( ) {
        Map<String, List<String>> map = new HashMap<>();
        map.put("one", Arrays.asList("1"));
        map.put("two", Arrays.asList("1","2"));
        map.put("three", Arrays.asList("1","2","3"));
        map.put("four", Arrays.asList("1","2","3","4"));
        map.put("five", Arrays.asList("1","2","3","4", "5"));
        return map;
    }

    public static Map<String, Integer> get_String_Integer_Map( ) {
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        return map;
    }
}
