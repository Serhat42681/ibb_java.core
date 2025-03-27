package com.serhattekin.part_1;

import java.io.Closeable;
import java.util.Scanner;

public class DenemeCode {

    public static void main(String[] args) {
        String name,surname;
        Scanner klavye= new Scanner(System.in);
        System.out.println("Lütfen Adınızı giriniz");
        name=klavye.nextLine();
        System.out.println("Soyadınızı giriniz");
        surname=klavye.nextLine();
        System.out.printf("Adınız: " + name +  " Soyadınız; S" + surname);

        //kullanmadığımız scanner nesnesini kapat
        klavye.close();
        

    }
}
