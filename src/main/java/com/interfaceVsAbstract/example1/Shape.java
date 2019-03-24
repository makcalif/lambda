package com.interfaceVsAbstract.example1;

public interface Shape {

     int finalVar = 0;

     abstract Double area();

     default String getName() {

         return "default name:" + this.getClass().getName();
     }

     static void staticMethod() {
         System.out.println("static method called");
     }
}
