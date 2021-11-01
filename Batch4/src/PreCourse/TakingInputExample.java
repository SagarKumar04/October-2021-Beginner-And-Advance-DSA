package PreCourse;

//1. import Scanner class
import java.util.Scanner;

public class TakingInputExample {
    public static void main(String[] args) {
        /*
        2. Creating object of Scanner class
        class-name object-name = new class-name();
         */
        Scanner scanner = new Scanner(System.in);

        //3. Taking input
        System.out.println("Enter value of 'a'");
        int a = scanner.nextInt();
        System.out.println(a);

        System.out.println("Enter value of 'b'");
        float b = scanner.nextFloat();
        System.out.println(b);

        System.out.println("Enter value of 'c'");
        double c = scanner.nextDouble();
        System.out.println(c);

        System.out.println("Enter value of 'd'");
        char d = scanner.next().charAt(0);
        System.out.println(d);
    }
}
