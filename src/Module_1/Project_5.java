package Module_1;

public class Project_5 {
    public static void main(String[] args) {

        // Given Values
        double w = -0.56;
        double lamba = 4.8;
        double n = 8;
        double v = -3.56;
        double Q = 2;

        double inner = (n/2.0)+ 2*v*Q-Math.abs(n/4);
        double answer = lamba *Math.sqrt(inner);

        System.out.printf("project 5 is: " + answer);



    }
}
