package com.serhattekin.part_1;

public class Java_sayilar {
    public static void main(String[] args) {
        int number1=10,number2=10;

        number1++;
        System.out.println(number1);
        int b=number1++;

        int c=++number2;
        System.out.println("number1 "+number1);
        System.out.println(number2);
        System.out.println(b);
        System.out.println(c);
    }
}
