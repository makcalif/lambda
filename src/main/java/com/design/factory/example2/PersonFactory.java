package com.design.factory.example2;

public interface PersonFactory <P extends Person> {
    P create();
}
