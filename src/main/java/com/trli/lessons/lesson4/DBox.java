package com.trli.lessons.lesson4;

public class DBox {
    double width;
    double height;
    double depth;

    // Конструктор 1
    public DBox(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    //Конструктор 2
    public DBox(double width) {
        this.width = width;
        this.depth = width;
        this.height = width;
    }

    double volume() {
        return width * height * depth;
    }


}
