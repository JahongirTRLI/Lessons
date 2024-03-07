package com.trli.lessons.lesson4;

public class FString {

    public static void main(String[] args) {
        String str1 = "AbcdEFGh";
        String str2 = "Hello world!";
        // System.out.println(str1 + str2);

        str1 = str1.concat("123456");
        System.out.println(str1);

        char[] symbols = str1.toCharArray();

        for(int i = 0; i < symbols.length; i++){
            symbols[i]++;
        }

        String newString = new String(symbols);

        newString = newString.toUpperCase();
        System.out.println(newString);

        System.out.println(newString.equals("BCDEFGHI2345678"));

        System.out.println(newString.contains("CDE"));


        newString = newString.replace("234567", " ");
        System.out.println(newString);

    }

}
