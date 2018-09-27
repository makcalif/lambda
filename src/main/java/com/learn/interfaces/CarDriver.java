package com.learn.interfaces;

/**
 * Created by x239954 on 8/10/2018.
 */
public class CarDriver {

    public static void main(String[] args) {
        Car<String, String> car = new Car<String, String>("vin1234");
        String v  = (String) car.register("vin3344", s -> {
            return s + "abc";
        });

        System.out.println(v);

        car.printReg();
    }
}
