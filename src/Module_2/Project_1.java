package Module_2;

import java.util.Scanner;

public class Project_1 {

    public static String Grades(double totalScore) {
        if (totalScore >= 70) return "A";
        else if (totalScore >= 60) return "B";
        else if (totalScore >= 50) return "C";
        else if (totalScore >= 45) return "D";
        else if (totalScore >= 40) return "E";
        else return "F";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int studnum = 0;

        while (true) {
            System.out.println("enter number of students:");
            if (input.hasNextInt()) {
                studnum = input.nextInt();
                input.nextLine();
                if (studnum > 0) {
                    break;
                } else {
                    System.out.println("Invalid! Enter positive whole numbers");
                }
            } else {
                System.out.println("Invalid entry! Enter a whole number.");
                input.next();
            }
        }

        String[] reg_nums = new String[studnum];
        double[] test_score = new double[studnum];
        double[] exam_score = new double[studnum];
        double[] total_score = new double[studnum];
        String[] grade = new String[studnum];

        for (int i = 0; i < studnum; i++) {
            System.out.println("Registration numbers?");
            reg_nums[i] = input.nextLine();

            while (true) {
                System.out.println("Input test score:");
                if (input.hasNextDouble()) {
                    test_score[i] = input.nextDouble();
                    if (test_score[i] >= 0 && test_score[i] <= 30) {
                        break;
                    } else {
                        System.out.println("Invalid! Min and max values allowed are 0 and 30 respectively");
                    }
                } else {
                    System.out.println("Invalid entry! Please enter a number");
                    input.next();
                }
            }

            while (true) {
                System.out.println("Input exams score:");
                if (input.hasNextDouble()) {
                    exam_score[i] = input.nextDouble();
                    input.nextLine();
                    if (exam_score[i] >= 0 && exam_score[i] <= 70) {
                        break;
                    } else {
                        System.out.println("Invalid! Min and max values allowed are 0 and 100 respectively");
                    }
                } else {
                    System.out.println("Please enter a number");
                    input.next();
                }
            }

            total_score[i] = test_score[i] + exam_score[i];
            grade[i] = Grades(total_score[i]);
        }

        System.out.println("\n--- Student Report ---");
        System.out.printf("%-15s %-10s %-10s %-10s %-6s\n", "Reg Number", "Test", "Exam", "Total", "Grade");
        for (int i = 0; i < studnum; i++) {
            System.out.printf("%-15s %-10.2f %-10.2f %-10.2f %-6s\n",
                    reg_nums[i], test_score[i], exam_score[i], total_score[i], grade[i]);
        }

        input.close();
    }
}