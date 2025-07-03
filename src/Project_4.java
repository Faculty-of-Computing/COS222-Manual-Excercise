public class Project_4 {
    public static double seriesTerm(int n) {
        if (n == 1) return 1.0 / 3.0;
        return (double)(seriesTerm(n - 1) * 2 + 1) / (seriesTerm(n - 1) * 3 + 1);
    }

    public static double sumSeries(int n) {
        if (n <= 0) return 0.0;
        return seriesTerm(n) + sumSeries(n - 1);
    }

    public static void main(String[] args) {
        int terms = 20;
        double sum = sumSeries(terms);
        System.out.printf("Sum of the first %d terms: %.6f%n", terms, sum);
    }
}