package com.trli.lesson1.BPrimitiveTypes;

/*
Существуют два числовых типа с плавающей точкой:
float и douЫe, которые соответственно представляют числа одинарной и двойной точности.
Их длина и диапазон допустимых значений:

double          от 4.9е-324 до 1.8е+308
float           от 1.4е-045 до З.4е+ОЗ8
*/
public class BFloats {
    public static void main(String[] args) {
        double d = 1.123;
        //float a = 1.1;
        float f = 1.1f;

        double pi, r, area;

        pi = Math.PI;
        r = 10.8;
        area = pi * r * r;

        System.out.println("Площадь круга равна " + area);
        System.out.println(Math.sqrt(2));
    }
}
