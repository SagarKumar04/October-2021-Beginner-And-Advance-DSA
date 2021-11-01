package String;

import java.util.Scanner;

public class StringExample1 {
    public static void main(String[] args) {
        //creating and initializing separately
        String str1;
        str1 = "Whatever!";
        System.out.println("str1: " + str1);

        //creating and initializing together
        String str2 = "Java";
        System.out.println("str2: " + str2);

        //taking user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str3 = scanner.nextLine();
        System.out.println("str3: " + str3);

        String str4 = scanner.next();
        System.out.println("str4: " + str4);

    }
}
