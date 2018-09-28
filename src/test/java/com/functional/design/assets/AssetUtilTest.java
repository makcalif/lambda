package com.functional.design.assets;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class AssetUtilTest{

    List<Asset> assetList;

    @Before
    public void before () {
        assetList = Arrays.asList(
                new Asset(10L, Asset.Type.STOCK),
                new Asset(145L, Asset.Type.BOND),
                new Asset(10L, Asset.Type.BOND)
        );
    }


    @Test
    public void testCalculateNetAssetValue () {

        Long total = AssetUtil.calculateNetAssetValue(assetList);
        Assert.assertTrue("asset sum is incorrect", total.equals(155L));
    }


    @Test
    public void testGetStockPrice () {
        Function<String, BigDecimal> stockFinder = ticker -> new BigDecimal("100.00");
        AssetUtil assetUtil = new AssetUtil(stockFinder);
        BigDecimal price = assetUtil.getStockPrice("GOOG", 10);
        BigDecimal expected = new BigDecimal("1000");
        Assert.assertEquals("price didn't match", price.compareTo(expected), 0);
    }

}
