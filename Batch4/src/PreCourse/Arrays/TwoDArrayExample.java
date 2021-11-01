package PreCourse.Arrays;

import java.util.Scanner;

public class TwoDArrayExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the number of rows required: ");
        int rowSize = scanner.nextInt();
        System.out.print("Please enter the number of columns required: ");
        int columnSize = scanner.nextInt();

        int arr[][] = new int[rowSize][columnSize];

        System.out.println("Enter elements of the array: ");
        for(int i = 0; i < rowSize; i++) {
            for(int j = 0; j < columnSize; j++) {
                System.out.print("[" + i + ", " + j + "]: ");
                arr[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Elements of the array are: ");
        for(int i = 0; i < rowSize; i++) {
            for(int j = 0; j < columnSize; j++) {
                System.out.print("[" + i + ", " + j + "]: " + arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
