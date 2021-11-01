package PreCourse.Arrays.Questions;

import java.util.Scanner;

public class Transpose {
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

        int transpose[][] = new int[columnSize][rowSize];
        for(int i = 0; i < rowSize; i++) {
            for(int j = 0; j < columnSize; j++) {
                transpose[j][i] = arr[i][j];
            }
        }

        System.out.println("Original Array: ");
        for(int i = 0; i < rowSize; i++) {
            for(int j = 0; j < columnSize; j++) {
                System.out.printf("%5d", arr[i][j]);
                //System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("Transpose Array: ");
        for(int i = 0; i < columnSize; i++) {
            for(int j = 0; j < rowSize; j++) {
                System.out.printf("%5d", transpose[i][j]);
                //System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
