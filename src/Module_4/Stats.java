package Module_4;

public class Stats {

    public static int getSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        //Put random numbers of arrays here
        int[] numbers = {-6,-7,-6, 20};

        System.out.println("Array Sum: " + getSum(numbers));
        System.out.println("Maximum Value: " + getMax(numbers));
        System.out.println("Minimum Value: " + getMin(numbers));
    }
}
