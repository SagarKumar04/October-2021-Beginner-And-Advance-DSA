package PreCourse.Arrays.Questions;

import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the value of 'size': ");
        int size = scanner.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter elements of the array: ");
        for(int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Please enter sum to be found: ");
        int sumToBeFound = scanner.nextInt();

        boolean isFound = false;
        int i, j;
        for(i = 0; i < size; i++) {
            for(j = (i + 1); j < size; j++) {
                int sum = arr[i] + arr[j];

                if(sum == sumToBeFound) {
                    isFound = true;
                    break;
                }
            }
            if(isFound) {
                break;
            }
        }

        System.out.println(isFound);
    }
}
