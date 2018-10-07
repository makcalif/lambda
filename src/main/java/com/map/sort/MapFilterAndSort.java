package com.map.sort;

import com.map.util.MapUtil;

import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;

/**
 * Created by x239954 on 10/3/2018.
 */
public class MapFilterAndSort {

    public static void main(String[] args) {
        Map<String, Integer> map = MapUtil.get_String_Integer_Map();
        // sum of top two values

        Integer sumTopTwo = map.values().stream()
                .sorted( Comparator.reverseOrder())
                   .limit(2)
                   .mapToInt( e -> e.intValue())
                   .sum();




    }
}
