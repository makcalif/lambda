package com.design.command;

public class CommandClient {
    public static void main(String[] args) {
        System.out.println("starting ...");

        Command leftCommand = new LeftCommand();
        leftCommand.execute(new Vehicle());
        Command rightCommand = (v) -> v.turnRight();
        rightCommand.execute(new Vehicle());

    }
}

@FunctionalInterface
interface Command {
    public void execute(final Vehicle vehicle);
}

class Vehicle {
    public void turnRight() {
        System.out.println("turning right");
    }
    public void turnLeft() {
        System.out.println("turning left");
    }
}

class LeftCommand implements Command {
    @Override
    public void execute(Vehicle vehicle) {
        vehicle.turnLeft();
    }
}

// don't need right command if using lambda exp
//class RightCommand implements Command {
//    @Override
//    public void execute(Vehicle vehicle) {
//        vehicle.turnRight();
//    }
//}