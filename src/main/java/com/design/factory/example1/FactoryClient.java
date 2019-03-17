package com.design.factory.example1;

import java.util.function.Supplier;

public class FactoryClient {

    public static void main(String[] args) {
        // no point in using lambda for this as here we will have more than 1 method to implement
        // Shape circle = () -> System.out.println("drawing circle");
        // Shape square = () -> System.out.println("drawing square");

        Supplier<Shape> circleSupplier = Circle::new;
        circleSupplier.get().draw();

        Supplier<ShapeFactory> shapeFactorySupplier = ShapeFactory::new;
        ShapeFactory shapeFactory = shapeFactorySupplier.get();

        shapeFactory.getShape("CIRCLE").draw();
        shapeFactory.getShape("SQUARE").draw();

    }


}

interface Shape {
    void draw();
    Double getArea();
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("drawing circle");
    }

    @Override
    public Double getArea() {
        return 4.5;
    }
}

class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("drawing square");
    }

    @Override
    public Double getArea() {
        return 16.0;
    }
}




