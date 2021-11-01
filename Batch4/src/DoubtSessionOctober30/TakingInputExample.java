package DoubtSessionOctober30;

//1. Import Scanner class
import java.util.Scanner;

public class TakingInputExample {
    public static void main(String[] args) {
        //2. Create an object of Scanner class
        Scanner scanner = new Scanner(System.in);

        int num;
        System.out.println("Enter the value of 'num': ");
        //3. Using appropriate function of the Scanner class
        num = scanner.nextInt();
        /*
        int -> scanner.nextInt()
        float -> scanner.nextFloat()
        double -> scanner.nextDouble()
        .
        .
        .
        char -> scanner.next().charAt(0)
         */
        System.out.println("Value of 'num' is: " + num);
    }
}
