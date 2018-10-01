package com.design.decorator;


import java.awt.*;
import java.util.function.Function;
import java.util.stream.Stream;

public class Camera {
    private Function<Color, Color> filter;

    public Camera() {
        setFilters();
    }

    public Camera(Function<Color, Color> filters) {
        setFilters(filters);
    }

    public void setFilters(Function<Color, Color> ... filters) {
        this.filter = Stream.of(filters)
                .reduce((filter, next) -> filter.compose(next))
                .orElse(color -> color);
    }

    public Color snap(Color input) {
        return filter.apply(input);
    }
}
