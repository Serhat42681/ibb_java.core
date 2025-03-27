package com.serhattekin.part_1;

import java.util.Scanner;

public class Problemler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Faktoriyelini bulmak istediğiniz değeri giriniz");
        int faktoriyel= scanner.nextInt();
        int sonuc=1;

        for(int i= 1 ;i<=faktoriyel ; i++) {
            sonuc*=i;
        }

        System.out.println("Faktoriyeli:"+sonuc);
    }
}
