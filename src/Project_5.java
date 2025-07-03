public class Project_5 {
    public static double mean(double[] values) {
        double sum = 0.0;
        for (double num : values) {
            sum += num;
        }
        return sum / values.length;
    }

    public static double standardDeviation(double[] values) {
        double meanValue = mean(values);
        double sumSquaredDiffs = 0.0;

        for (double num : values) {
            sumSquaredDiffs += Math.pow(num - meanValue, 2);
        }

        return Math.sqrt(sumSquaredDiffs / values.length);
    }

    public static void main(String[] args) {
        double[] data = {2.5, 4.0, 6.0, 8.0, 10.5};

        double mean = mean(data);
        double stdDev = standardDeviation(data);

        System.out.printf("Mean: %.2f\n", mean);
        System.out.printf("Standard Deviation: %.2f\n", stdDev);

}
}