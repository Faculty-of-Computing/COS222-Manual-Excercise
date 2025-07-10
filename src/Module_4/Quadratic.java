package Module_4;

import java.util.Scanner;
public class Quadratic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = input.nextDouble();

        System.out.print("Enter b: ");
        double b = input.nextDouble();

        System.out.print("Enter c: ");
        double c = input.nextDouble();

        double dis = b * b - 4 * a * c;

        if (dis > 0) {
            double x1 = (-b + Math.sqrt(dis)) / (2 * a);
            double x2 = (-b - Math.sqrt(dis)) / (2 * a);
            System.out.println("Two real solutions: " + x1 + " and " + x2);
        } else if (dis == 0) {
            double x = -b / (2 * a);
            System.out.println("One real solution: " + x);
        } else {
            System.out.println("No real solutions.");
        }

        input.close();
    }
}