package com.map.sort;

import com.map.util.MapUtil;

import java.util.Comparator;
import java.util.Map;

/**
 * Created by x239954 on 10/3/2018.
 */
public class MapFilterAndSort {

    public static void main(String[] args) {
        Map<String, Integer> map = MapUtil.get_String_Integer_Map();
        // sum of top two values

        map.values().stream()
                .mapToInt(t -> )
                .sorted(Comparator.<Integer>reverseOrder())
                .limit(2)
                .sum();


    }
}
