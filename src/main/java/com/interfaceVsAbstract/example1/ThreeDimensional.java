package com.interfaceVsAbstract.example1;

public interface ThreeDimensional {
    default String getName() {

        return "default 3d name:" + this.getClass().getName();
    }
}
