package Recursion;

public class PowerCalculationUsingRecursion1 {
    static long power(int a, int b) {
        if(b == 0) {
            return 1;
        }
        else if(b == 1) {
            return a;
        }
        else {
            return a * power(a, b - 1);
        }
    }

    public static void main(String[] args) {
        int a = 5;
        int b = -3;
        double result;

        if(b > 0) {
            result = power(a, b);
        }
        else {
            result = 1.0 / power(a, -b);
        }

        System.out.println("Result: " + result);
    }
}
