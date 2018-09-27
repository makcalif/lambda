package com.functional.design.assets;

import java.util.List;

/**
 * Created by x239954 on 9/27/2018.
 */
public class AssetUtil {

    public static Long calculateNetAssetValue(List<Asset> assetList) {
        return assetList.stream()
                .mapToLong(asset -> asset.getValue())
                .sum();
    }
}
