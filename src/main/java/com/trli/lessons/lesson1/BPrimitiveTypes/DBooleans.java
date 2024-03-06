package com.trli.lessons.lesson1.BPrimitiveTypes;

/*
В языкеjаvа имеется примитивный тип boolean,
предназначенный для хранения логических значений.
Переменные этого типа могут принимать только одно из двух возможных значений:
true (истинное) или false (ложное)
*/
public class DBooleans {
    public static void main(String[] args) {
       /* boolean b;

        b = false;
        System.out.println("b равно " + b);

        b = true;
        System.out.println("b равно " + b);

        if (b) System.out.println("Этот код выполняется");
        b = false;
        if (b) System.out.println("Этот код не выполняется");*/

        int a = 10;
        if (a > 10) {
            System.out.println("a больше 10");
        } else {
            System.out.println("b меньше 10");
        }

        System.out.println("10 > 9 = " + (10 > 9));
    }
}
