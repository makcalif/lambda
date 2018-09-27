package com.learn.interfaces;

import java.util.function.Function;

public class Car<Tag, Vin> implements Vehicle {
    Tag tag;
    Vin vin;

    public Car(Vin vin) {
        this.vin = vin;
    }



    public void printReg() {
        System.out.printf("Tag: %s and Vin: %s", tag, vin);
    }

}
