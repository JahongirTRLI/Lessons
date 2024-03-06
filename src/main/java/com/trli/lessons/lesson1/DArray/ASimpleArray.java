package com.trli.lessons.lesson1.DArray;

/*
Массив - это группа однотипных неременных,
для обращения к которым используется общее имя.
В Java допускается созданис массивов любого тина и размерности.
Достун к конкретному элементу массива осрществляется по его индексу.
Массив предоставлякп удобный способ группирования свя:1а111юй вместе информации.
 */
public class ASimpleArray {
    public static void main(String[] args) {
        int month_days[];

        month_days = new int[12];
        month_days[0] = 31;
        month_days[1] = 28;
        month_days[2] = 31;
        month_days[3] = 30;
        month_days[4] = 31;
        month_days[5] = 30;
        month_days[6] = 31;
        month_days[7] = 31;
        month_days[8] = 30;
        month_days[9] = 31;
        month_days[10] = 30;
        month_days[11] = 31;

        System.out.println("В апреле " + month_days[3] + "дней");

    }
}
