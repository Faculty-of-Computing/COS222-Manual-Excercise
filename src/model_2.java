public class model_2 {
    public static void main(String[] args) {
        double w = -0.56;
        double T = 6.09;
        double a = 2;
        double n = 8;
        double b = 7;
        double v = -3.56;
        double Q = 2;
        double p1 = 0.45;
        double q1 = 3.46;

        double model2 = Math.abs(
                -2 * w * T
                        - (w * a) / (n * T)
                        - b
                        + (v * Q) / (Math.abs(p1) * Math.abs(q1))
        );

        System.out.printf("Model 2 Result:", model2);
    }

}
