package Module_2;

import java.util.Scanner;

public class Project_2 {

    // advise method now takes passed count and total students
    public static void advise(int passedCount, int totalStudents) {
        if (passedCount > (totalStudents * 60 / 100)) {
            System.out.println("Increase fees");
        } else {
            System.out.println("Don't increase fees");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int studentsno;

        while (true) {
            System.out.print("Enter number of students: ");
            if (scan.hasNextInt()) {
                studentsno = scan.nextInt();
                if (studentsno > 0) {
                    break;
                } else {
                    System.out.println("Incorrect input! Enter a positive whole number.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scan.next(); // clear invalid input
            }
        }

        int[] passed = new int[studentsno];
        int[] failed = new int[studentsno];
        int passedCount = 0;
        int failedCount = 0;

        for (int i = 0; i < studentsno; i++) {
            int score;
            while (true) {
                System.out.print("Enter score for student " + (i + 1) + ": ");
                if (scan.hasNextInt()) {
                    score = scan.nextInt();
                    break;
                } else {
                    System.out.println("Invalid score. Please enter a number.");
                    scan.next(); // clear invalid input
                }
            }

            if (score >= 275) {
                passed[passedCount] = score;
                passedCount++;
            } else {
                failed[failedCount] = score;
                failedCount++;
            }
        }

        System.out.println("\nNumber of students admitted: " + passedCount);
        for (int i = 0; i < passedCount; i++) {
            System.out.print(passed[i] + " ");
        }

        System.out.println("\nNumber of students not admitted: " + failedCount);
        for (int i = 0; i < failedCount; i++) {
            System.out.print(failed[i] + " ");
        }

        System.out.println(); // line break
        advise(passedCount, studentsno); // call the advise method
        scan.close();
    }
}
