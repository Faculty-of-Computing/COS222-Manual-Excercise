package Module_1;

public class Project_3 {

    public static void main(String[] args) {
    double side_a = 20; //value given
    double side_b = 27.45; //value given
    int side_c = 18; //value given
    
        double s = (side_a + side_b + side_c) / 2;
        double ScaleneArea = Math.sqrt(s * (s - side_a) * (s - side_b) * (s - side_c));
        System.out.printf("%.3f is the area of a scalene triangle\n", ScaleneArea);
    }
}