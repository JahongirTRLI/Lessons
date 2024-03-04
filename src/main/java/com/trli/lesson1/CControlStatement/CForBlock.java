package com.trli.lesson1.CControlStatement;

public class CForBlock {
    public static void main(String[] args) {
        int x, y;

        y = 20;
        for (x = 0; x < 10; x++) {
            System.out.println("Значение x: " + x);
            System.out.println("Значение y: " + y);
            y = y - 2;
        }
    }
}
