package com.trli.lessons.lesson1.EScanner;

import java.util.Scanner;

public class ASimpleScannerExample {
    public static void main(String[] args) {
        // Random r = new Random();
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String s = scanner.next();

        System.out.println("Строка которую мы получили ->>" + s + "<---");

    }
}
