package Recursion;

public class PowerCalculationUsingRecursion2 {
    static double power(int a, int b) {
        if(b == 0) {
            return 1;
        }
        else if(b == 1) {
            return a;
        }
        else if(b < 0) {
            return 1.0 / power(a, -b);
        }
        else {
            return a * power(a, b - 1);
        }
    }

    public static void main(String[] args) {
        int a = 10;
        int b = -3;
        double result;

        result = power(a, b);

        System.out.println("Result: " + result);
    }
}
