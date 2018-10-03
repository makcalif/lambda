package com.map.aggregate;

import com.map.util.MapUtil;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AggregateValuesByKey {

    public static int countOfValues() {

        // get counts of all values
        Map<String, List<String>> map = MapUtil.getStringKeyValuesList();
        int countOfValues = map.values().stream()
                .mapToInt(val -> val.size())
                .sum();

        return countOfValues;
    }
}
