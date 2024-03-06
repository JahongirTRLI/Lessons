package com.trli.lessons.lesson3.CMethods;

public class ASimpleMethod {
    /*
    примитивные типы передаются по значениям
    классы передаются по ссылкам
    */
    public static void main(String[] args) {
        ASimpleMethod a = new ASimpleMethod();

        System.out.println(a.squareInt(1));
        System.out.println(a.squareDouble(1.1));
        System.out.println(a.squareString("abc"));
    }

    public int squareInt(int a) {
        // ...
        return a * a;
    }

    double squareDouble(double d) {
        // ...
        return d * d;
    }

    protected String squareString(String s) {
        return s + s;
    }

    private Float squareFloat(float a) {
        return new Float(a * a);
    }


}
