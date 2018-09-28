package com.functional.design.assets;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

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

}
