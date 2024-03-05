package com.trli.lesson3.BLogic;

public class CTernary {
    public static void main(String[] args) {
        int i, k;

        i = 213;

        if (i < 0) {
            k = -i;
        } else {
            k = i;
        }

        i = 10;
        k = i < 0 ? -i : (i < 0) ? -i : i;
        System.out.println("|" + i + "| = " + k);


        i = -10;
        k = i < 0 ? -i : i;
        System.out.println("|" + i + "| = " + k);
    }
}
