package com.serhattekin.part_1;

import java.util.Scanner;

public class ksu_ortalamahesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] gradePoints = {4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.5, 0.0};
        String[] gradeLetters = {"AA", "BA", "BB", "CB", "CC", "DC", "DD", "FD", "FF"};

        System.out.print("Kaç dersiniz var? ");
        int numCourses = scanner.nextInt();

        double totalPoints = 0;
        int totalCredits = 0;

        for (int i = 0; i < numCourses; i++) {
            System.out.print((i + 1) + ". dersin harf notunu girin (AA, BA, BB, ...): ");
            String grade = scanner.next().toUpperCase();
            System.out.print((i + 1) + ". dersin kredisini girin: ");
            int credit = scanner.nextInt();

            double gradePoint = 0.0;
            for (int j = 0; j < gradeLetters.length; j++) {
                if (grade.equals(gradeLetters[j])) {
                    gradePoint = gradePoints[j];
                    break;
                }
            }

            totalPoints += gradePoint * credit;
            totalCredits += credit;
        }

        double gpa = (totalCredits == 0) ? 0.0 : totalPoints / totalCredits;
        System.out.printf("Ortalamanız: %.2f\n", gpa);

        scanner.close();
    }
}
