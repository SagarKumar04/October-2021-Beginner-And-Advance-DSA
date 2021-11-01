package PreCourse.Arrays.Questions;

import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the value of N: ");
        int size = scanner.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter elements of the array: ");
        for(int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        int largest = arr[0];
        for(int i = 1; i < size; i++) {
            if(arr[i] > largest) {
                largest = arr[i];
            }
        }

        System.out.println("Largest: " + largest);
    }
}
