package com.functional.design.assets;

import java.math.BigDecimal;
import java.util.List;
import java.util.function.Function;

/**
 * Created by x239954 on 9/27/2018.
 */
public class AssetUtil {

    Function<String, BigDecimal> StockService;

    public static Long calculateNetAssetValue(List<Asset> assetList) {
        return assetList.stream()
                .mapToLong(asset -> asset.getValue())
                .sum();
    }
}
