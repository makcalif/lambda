package com.design.strategy;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class StrategyTest {

    @Test
    public void testCalculateAssets() {

        List<Asset> assets = Arrays.asList(
                new Asset(Asset.Type.BOND, 100L),
                new Asset(Asset.Type.STOCK, 100L)
        );
        Long expected= 100L;
        Long value = AssetCalculator.calculateAssetValue(assets, asset -> asset.getType() == Asset.Type.BOND);
        Assert.assertEquals("bond value is incorrect", expected, value );
    }
}
