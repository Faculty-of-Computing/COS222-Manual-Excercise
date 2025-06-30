package Module_1;

public class model_3 {
    public static void main(String[] args) {
        double p1 = 0.45;
        double v2 = 8;
        double R1 = 4.8;
        double v = -3.56;

        double beta = Math.sin(v);

        double model3 = Math.exp((p1 / Math.sqrt(v2 * R1)) - beta);

        System.out.printf("Model 3 Result", model3);
    }
}