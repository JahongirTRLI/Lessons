package com.trli.lessons.lesson3.CMethods;

public class BClassToMethod {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int b = 0;

        ar(a);
        pr(b);

        for(int i=0; i< a.length; i++){
            System.out.print(a[i] + " ");
        }

        System.out.println("\n\n\n");
        System.out.println(b);
    }

    public static void ar(int[] array){
        array[0] =1000;
    }

    public static void pr(int a){
        a = 10;
    }

}
