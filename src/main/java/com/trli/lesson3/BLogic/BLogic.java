package com.trli.lesson3.BLogic;

public class BLogic {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;

        if (a++ == 1 && b++ == 2) {
            System.out.println("Inside first if");
        }
        System.out.println("a=" + a + ", b=" + b);

        int c = 0;
        int d = 0;

        if (c == 0 || d++ == 1) {
            System.out.println("Inside secoond if");
        }
        System.out.println("c=" + c + ", d=" + d);

    }

}
