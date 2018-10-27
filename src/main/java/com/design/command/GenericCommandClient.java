package com.design.command;

import javax.xml.bind.SchemaOutputResolver;

public class GenericCommandClient {
    public static void main(String[] args) {

        GenericCommand<TV>  tvOnCommand = (t) -> t.turnOnTv();
        tvOnCommand.execute(new TV());

        GenericCommand<Fridge> fridgeDispenseWaterCommand = Fridge::dispenseWater;
        fridgeDispenseWaterCommand.execute(new Fridge());
    }
}

@FunctionalInterface
interface GenericCommand<T> {
    void execute(final T t);
}

class TV  {
    public void turnOnTv () {
        System.out.println("turning on TV");
    }
    public void turnOffTv () {
        System.out.println("turning off TV");
    }
}

class Fridge {
    public void dispenseWater() {
        System.out.println("dispensing water");
    }
    public void freezeIceCubes() {
        System.out.println("freezing ice cubes");
    }

}