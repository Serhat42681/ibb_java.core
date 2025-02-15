package com.serhattekin.part_1;

import java.util.Scanner;

public class ksu_ortalamahesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç dersiniz var? ");
        int numCourses = scanner.nextInt();

        double totalPoints = 0;
        int totalCredits = 0;

        for (int i = 0; i < numCourses; i++) {
            System.out.print((i + 1) + ". dersin notunu girin (0-100 arasında): ");
            int numericGrade = scanner.nextInt();
            System.out.print((i + 1) + ". dersin kredisini girin: ");
            int credit = scanner.nextInt();

            // Not aralığına göre harf notu ve katsayı belirleme
            double gradePoint;
            if (numericGrade >= 88) {
                gradePoint = 4.0;  // AA
            } else if (numericGrade >= 79) {
                gradePoint = 3.5;  // BA
            } else if (numericGrade >= 71) {
                gradePoint = 3.0;  // BB
            } else if (numericGrade >= 63) {
                gradePoint = 2.5;  // CB
            } else if (numericGrade >= 55) {
                gradePoint = 2.0;  // CC
            } else if (numericGrade >= 47) {
                gradePoint = 1.5;  // DC
            } else if (numericGrade >= 40) {
                gradePoint = 1.0;  // DD
            } else if (numericGrade >= 31) {
                gradePoint = 0.5;  // FD
            } else {
                gradePoint = 0.0;  // FF
            }

            // Toplam puan ve krediyi hesapla
            totalPoints += gradePoint * credit;
            totalCredits += credit;
        }

        // Genel not ortalaması hesaplama
        double gpa = (totalCredits == 0) ? 0.0 : totalPoints / totalCredits;
        System.out.printf("Ortalamanız: %.2f\n", gpa);

        scanner.close();
    }
}
