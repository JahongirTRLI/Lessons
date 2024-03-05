package com.trli.lesson3.BLogic;

public class CTernary {
    public static void main(String[] args) {
        int i, k;

        i = 10;
        k = i < 0 ? -i : i;
        System.out.println("|" + i + "| = " + k);


        i = -10;
        k = i < 0 ? -i : i;
        System.out.println("|" + i + "| = " + k);
    }
}
