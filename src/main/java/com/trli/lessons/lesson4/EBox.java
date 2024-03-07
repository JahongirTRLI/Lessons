package com.trli.lessons.lesson4;

public class EBox {
    double width;
    double height;
    double depth;

    // Конструктор 1
    public EBox(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    //Конструктор 2
    public EBox(double width) {
        this.width = width;
        this.depth = width;
        this.height = width;
    }

    double volume() {
        return width * height * depth;
    }

    void printVolume() {
        System.out.println("Объем коробки " + this.volume());
    }

}
