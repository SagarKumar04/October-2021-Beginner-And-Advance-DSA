package Recursion;

public class FactorialUsingLoopAndRecursionWithTimeCalculation {
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
        long factorial = 1; //1 -> int, 1L -> long
        long startTime, endTime, timeTaken;

        //Finding factorial of 'n' using loop and calculating the time taken
        startTime = System.nanoTime();
        for(int i = n; i >= 1; i--) {
            factorial = factorial * i;
        }
        endTime = System.nanoTime();
        timeTaken = endTime - startTime;

        System.out.println("Factorial (using loop): " + factorial);
        System.out.println("Time Taken (using loop): " + timeTaken);

        //Finding factorial of 'n' using recursion and calculating the time taken
        startTime = System.nanoTime();
        factorial = findFactorial(n);
        endTime = System.nanoTime();
        timeTaken = endTime - startTime;

        System.out.println("Factorial (using recursion): " + factorial);
        System.out.println("Time Taken (using recursion): " + timeTaken);
    }
}
