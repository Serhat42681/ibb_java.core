package com.serhattekin.part_1;

import java.util.Scanner;

public class SwichCase {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int number = scanner.nextInt(); // Kullanıcıdan giriş al

        switch (number) {
            case 1:
                System.out.println("sayi 1");
                break;
            case 2:
                System.out.printf("Sayi 2");
            default:
                System.out.printf("geçersiz sayı");

        }
scanner.close();
    }
}
