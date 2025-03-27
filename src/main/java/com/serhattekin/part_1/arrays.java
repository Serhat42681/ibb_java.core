package com.serhattekin.part_1;

public class arrays {
    static String[] city = new String[5];
    public static void arrayMethod1() throws ArrayIndexOutOfBoundsException {

        city[0] = "Aksaray";
        city[1] = "Kahramanmaraş";

    }

    public static void main(String[] args) {
        // Metottan gelen diziyi al
        arrayMethod1();

        // Dizinin elemanını yazdır
        System.out.println(city[0]); // Çıktı: Kahramanmaraş
    }
}
