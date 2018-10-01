package com.design.strategy;

import java.util.List;
import java.util.function.Predicate;

public class AssetCalculator {

    public static Long calculateAssetValue(List<Asset> assets, Predicate<Asset> selector) {
        Long sum = assets.stream()
                .filter(selector)
                .mapToLong(asset -> asset.getValue())
                .sum();

        return sum;
    }
}
