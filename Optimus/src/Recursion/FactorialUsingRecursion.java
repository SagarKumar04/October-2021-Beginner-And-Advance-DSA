package Recursion;

public class FactorialUsingRecursion {
    static long findFactorial(int n) {
        long factorial;
        if(n == 0 || n == 1) {
            factorial = 1;
        }
        else {
            factorial = n * findFactorial(n - 1);
        }

        return factorial;
    }

    public static void main(String[] args) {
        int n = 5;
        long factorial = 1;

        factorial = findFactorial(n);

        System.out.println("Factorial: " + factorial);
    }
}
