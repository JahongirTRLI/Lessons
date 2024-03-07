package com.trli.homeworks.homework3;

import java.util.Arrays;
import java.util.Random;

public class Homework3 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            provideTime(10_000, 100);
        }

    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
    }

    public static void quickSort(int[] arr) {
        Arrays.sort(arr);
    }

    public static int[] arrayProvider(int n, int k) {
        int[] arr = new int[n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(k);
        }

        return arr;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void provideTime(int n, int k) {
        long time1 = System.currentTimeMillis();
        int arr[] = arrayProvider(n, k);
        long time2 = System.currentTimeMillis();

        System.out.println("Dремя выполнения метода " + (time2 - time1));
    }
}
