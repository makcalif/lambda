package com.interfaceVsAbstract.example1;

public class Circle implements Shape { //}, ThreeDimensional {
    private double radius;


    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public Double area() {

        return Math.PI * Math.pow(radius, 2);

    }

    public static void main (String ... args) {
        Shape shape = new Circle(2.5);
        System.out.println(" area is :" + shape.area());
        System.out.println(" name is :" + shape.getName());
        Shape.staticMethod();
    }

}
