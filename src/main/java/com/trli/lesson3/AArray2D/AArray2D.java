package com.trli.lesson3.AArray2D;

public class AArray2D {

    public static void main(String[] args) {
        int twoD[][] = new int[4][5];
        int k = 0;

        System.out.println("Инициализация массива \n");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                twoD[i][j] = k;
                k++;
            }
        }

        System.out.println("Вывод массива \n");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(twoD[i][j] + " ");
            }
            System.out.println();
        }

    }
}
