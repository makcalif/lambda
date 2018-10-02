package com.map.aggregate;

import org.junit.Assert;
import org.junit.Test;

public class AggregateValuesByKeyTest {

    @Test
    public void testCountOfValues() {
        int countOfValues = AggregateValuesByKey.countOfValues();

        Assert.assertEquals("count is incorrect", 15, countOfValues);
    }
}
