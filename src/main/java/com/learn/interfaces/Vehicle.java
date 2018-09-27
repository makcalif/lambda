package com.learn.interfaces;

import java.util.Objects;
import java.util.function.Function;


public interface Vehicle<Tag, Vin> {

    default Tag register(Vin vin, Function<Vin, Tag> mappingFunction) {
        Objects.requireNonNull(mappingFunction);

        Tag c =  mappingFunction.apply(vin);
        return c;
    }

}
