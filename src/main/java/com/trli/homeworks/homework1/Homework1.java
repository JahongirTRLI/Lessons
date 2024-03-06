package com.trli.homeworks.homework1;

import java.util.Random;
import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        int rnd = random.nextInt(100) + 1;

        System.out.println("Я загадал число от 1 до 100(включительно)");

        int tr = 8;
        boolean ok = false;

        int i;

        for (i = 0; i < tr; i ++) {
            //change
            // another change
            int num = scanner.nextInt();
            if (num > rnd) {
                System.out.println("Мое число меньше.");
            } else if (num < rnd) {
                System.out.println("Мое число больше");
            } else {
                System.out.println("Ты угадал!!!");
                ok = true;
                break;
            }
        }
        if (!ok) {
            System.out.println("Ты не угадал. Попробуй использовать бинарный поиск!");
        }
    }
}
