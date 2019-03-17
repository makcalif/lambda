package com.design.factory.example1;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class ShapeFactory {
    final static Map<String, Supplier<Shape>> SHAPE_SUPPLIER = new HashMap<>();
    static {
        SHAPE_SUPPLIER.put("CIRCLE", Circle::new);
        SHAPE_SUPPLIER.put("SQUARE", Square::new);
    }

    public Shape getShape(String shape) {
        return SHAPE_SUPPLIER.get(shape).get();
    }
}
