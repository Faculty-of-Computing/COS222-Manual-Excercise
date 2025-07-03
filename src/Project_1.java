public class Project_1 {
    public static void solveQuadratic(double a, double b, double c) {
        if (a == 0) {
            System.out.println("Not a quadratic equation.");
            return;
        }

        double d = b * b - 4 * a * c;

        if (d > 0) {
            System.out.println("Two real roots: " +
                    ((-b + Math.sqrt(d)) / (2 * a)) + " and " +
                    ((-b - Math.sqrt(d)) / (2 * a)));
        } else if (d == 0) {
            System.out.println("One real root: " + (-b / (2 * a)));
        } else {
            System.out.println("No real solutions.");
        }
    }

    public static void main(String[] args) {
        solveQuadratic(1, -3, 2);
        solveQuadratic(1, 2, 1);
        solveQuadratic(1, 1, 1);


    }
}