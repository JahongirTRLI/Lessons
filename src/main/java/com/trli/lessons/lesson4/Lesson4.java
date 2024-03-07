package com.trli.lessons.lesson4;

public class Lesson4 {

    public static void main(String[] args) {

      /*  BBox box1 = new BBox();
        box1.depth = 1;
        box1.width = 2;
        box1.height = 3;

        BBox box2 = new BBox();
        box2.depth = 4;
        box2.width = 5;
        box2.height = 6;

        double vol1 = box1.depth * box1.height * box1.width;
        double vol2 = box2.depth * box2.height * box2.width;

        System.out.println("Объем box1 равен " + vol1);
        System.out.println("Объем box2 равен " + vol2);*/

/*

        CBox box1 = new CBox();

        box1.depth = 1;
        box1.width = 2;
        box1.height = 3;

        CBox box2 = new CBox();
        box2.depth = 4;
        box2.width = 5;
        box2.height = 6;

        double vol1 = box1.volume();
        double vol2 = box2.volume();

        System.out.println("Объем box1 равен " + vol1);
        System.out.println("Объем box2 равен " + vol2);
*/


       /* DBox box1 = new DBox(1,2,3);
        DBox box2 = new DBox(3);

        double vol1 = box1.volume();
        double vol2 = box2.volume();

        System.out.println("Объем box1 равен " + vol1);
        System.out.println("Объем box2 равен " + vol2);*/

        EBox box1 = new EBox(1, 2, 3);
        EBox box2 = new EBox(3);

        box1.printVolume();
        box2.printVolume();
    }


}
