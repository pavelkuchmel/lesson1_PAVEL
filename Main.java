package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        //Begin1. Дана сторона квадрата a. Найти его периметр P = 4·a
        //Ввод или присвоение исходных
    /*    int x=5;
        int p=4*x;
    System.out.println(p);
     */

        //Begin2 Дана сторона квадрата a. Найти его площадь S = a^2
    /*int a=2;
    int s=a*a;
    System.out.println("У квадрата со стороной а "+a+" площадь " +s);
     */

            //Begin4.Дан диаметр окружности d. Найти ее длину L = π·d. В качеств значения π использовать 3.14.
        /*int d=10;
        final double pi=3.14;
        double L=pi*d;
        System.out.println("У круга с диаметром " + d + " длина окружности " + L);
        */
        //Begin5. Дана длина ребра куба a. Найти объем куба V = a^3 и площадь его поверхности S = 6·a^2
        /*int a =4;

        int v=a*a*a;
        int s=a*a*6;
        System.out.println("Площадь куба "+v);
        System.out.println("Объем куба "+s);
         */
        //Begin6. Даны длины ребер a, b, c прямоугольного параллелепипеда. Найти его объем V = a·b·c и площадь поверхности S = 2·(a·b + b·c + a·c)
        /*int a=2;
        int b=3;
        int c=4;
        int V=a*b*c;
        int S=2*(a*b + b*c + a*c);
        System.out.println("V: "+V);
        System.out.println("S: "+S);
         */
        //Begin8 Даны два числа a и b. Найти их среднее арифметическое: (a + b)/2
        /*int a=10;
        int b=5;
        double f=2.0;
        double s;
        s=(a+b)/f;
        System.out.println(s);
         */
        //Begin8.1 Даны два числа a и b. Найти их среднее арифметическое: (a + b)/2
        /*int a=10;
        int b=5;
        int f=2;
        double s;
        s=(a+b)/(double)f;
        System.out.println(s);
         */
        //Begin10. Даны два ненулевых числа. Найти сумму, разность, произведение и частное их квадратов
        int a=25;
        int b=35;
        int S=a+b;
        int R=b-a;
        int P=a*b;
        double C=(a*b)/(a*b);
        System.out.println("Сумма "+S);
        System.out.println("Разность "+R);
        System.out.println("Произведение "+P);
        System.out.println("Частное квадратов "+C);
    }
}
