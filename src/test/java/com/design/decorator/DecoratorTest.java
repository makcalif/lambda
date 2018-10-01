package com.design.decorator;

import org.junit.Assert;
import org.junit.Test;

public class DecoratorTest {

    @Test
    public void testIncrement() {
        int val = Calculator.doWork(4, Calculator.increment);
        Assert.assertEquals("add didn't work", 5, val);
    }

    @Test
    public void testDouble() {
        int val = Calculator.doWork(4, Calculator.doubler);
        Assert.assertEquals("double didn't work", 8, val);
    }

    @Test
    public void testSquare() {
        int val = Calculator.doWork(4, Calculator.squarer);
        Assert.assertEquals("square didn't work", 16, val);
    }

    @Test
    public void testDoMultipleOps () {
        int val = Calculator.doWork(4, Calculator.increment
                .andThen(Calculator.doubler)
                .andThen(Calculator.squarer));

        Assert.assertEquals("multiple ops didn't work", 100, val);
    }

}
