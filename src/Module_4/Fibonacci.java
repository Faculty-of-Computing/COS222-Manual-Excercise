package Module_4;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;
        int first = 1, second = 1;

        System.out.print("Fibonacci Sequence: ");
        System.out.print(first + " " + second + " ");

        for (int i = 3; i <= n; i++) {
            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
    }
}