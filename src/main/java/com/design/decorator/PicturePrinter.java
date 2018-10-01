package com.design.decorator;

import java.awt.*;

public class PicturePrinter {

    public static void printSnap(Camera camera) {
        System.out.println(camera.snap(new Color(120,120,120)));
    }
    public static void main(String[] args) {
        printSnap(new Camera());
        printSnap(new Camera(Color::brighter));
    }
}
