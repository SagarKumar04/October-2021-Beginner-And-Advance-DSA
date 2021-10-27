package Functions;

import java.util.Scanner;

public class FunctionExample {
    //no parameter list and no return type
    static void function1() {
        System.out.println("In function1() method");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        float a = scanner.nextFloat();
        System.out.println("Enter the second number: ");
        float b = scanner.nextFloat();

        float sum = a + b;

        System.out.println("Sum: " + sum);
    }

    //no parameter list and return type
    static int function2() {
        System.out.println("In function2() method");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int b = scanner.nextInt();

        int sum = a + b;

        return sum;
    }

    //parameter list and no return type
    static void function3(int a, float b) {
        System.out.println("In function3() method");

        float sum = a + b;

        System.out.println("Sum: " + sum);
    }

    //parameter list and return type
    static float function4(int a, int b) {
        System.out.println("In function4() method");

        float sum = a + b;

        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        function1();
         */

        /*
        int sum2 = function2();
        System.out.println("Sum: " + sum2);
         */

        /*
        System.out.println("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.println("Enter the second number: ");
        float b = scanner.nextFloat();
        function3(a, b);
         */

        System.out.println("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int b = scanner.nextInt();
        float sum4 = function4(a, b);

        System.out.println("Sum: " + sum4);
    }
}
