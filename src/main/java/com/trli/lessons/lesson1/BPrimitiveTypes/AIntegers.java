package com.trli.lessons.lesson1.BPrimitiveTypes;

/*
Целые числа. Эта группа включает в себя типы данных
byte, short, int и long, представляющие целые числа со знаком

byte        8бит        от -128 до 127
short       16бит       от -32768 до 32767
int         32бит       от -2147483648 до 2147483647
long        64бит       от -9223372036854775808 до 9223372036854775807
*/
public class AIntegers {
    public static void main(String[] args) {
        byte b = 127;
        b++;
        System.out.println(b);

        short s = -32768;
        System.out.println(--s);
        int i = 32123;
        long l = 123L;
        long l1 = i;
        // int il = l + i;
        System.out.println(l + i);
        int х = 123_456_789;
    }
}
