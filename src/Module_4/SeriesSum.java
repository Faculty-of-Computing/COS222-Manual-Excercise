package Module_4;

public class SeriesSum {
    public static double seriesSum(int n) {
        if (n <= 1) return 1.0 / 3.0;
        return (2.0 * seriesSum(n - 1) + 1) / (3.0 * seriesSum(n - 1) + 1);
    }

    public static void main(String[] args) {
        double sum = 0.0;
        for (int i = 1; i <= 20; i++) {
            sum += seriesSum(i);
        }
        System.out.printf("Sum of first 20 terms:  %.5f", sum);
    }
}