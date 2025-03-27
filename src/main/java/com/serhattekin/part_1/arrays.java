package com.serhattekin.part_1;

public class arrays {

    public static String[] arrayMethod1() throws ArrayIndexOutOfBoundsException {
        String[] city = {"Aksaray","Maraş"};



        return city;
    }
    public static void arrayMethod2(){
        String[] city = arrayMethod1();
        for(String temp : city)
        {
            System.out.println(temp);
        }

    }

    public static void main(String[] args) {

        arrayMethod1();
        arrayMethod2();


    }
}
