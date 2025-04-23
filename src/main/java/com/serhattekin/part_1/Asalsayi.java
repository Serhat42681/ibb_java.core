package com.serhattekin.part_1;
import java.util.Scanner;

public class Asalsayi
{

    public static void main(String[] args) {
    System.out.println("Asal Sayı Doğrulama Sistemi");
    System.out.println("Doğrulamak istediğiniz sayiyi giriniz");
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    boolean isPrime = true;
    if (number == 1) {
        System.out.println("1 istisnadır ve Asal sayi değildir");
    } else

        for (int i=2;i<number; i++)
        {
            if (number%i==0){
                isPrime=false;
            }
        }
        if (isPrime){
            System.out.println("Sayi Asal sayıdır");
        }
        else{
            System.out.println("Sayi Asal değildir");
        }
    }


}
