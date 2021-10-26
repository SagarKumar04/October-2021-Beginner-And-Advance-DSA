package PreCourse.Arrays.Searching;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter the element to be searched: ");
        int element = scanner.nextInt();

        int index = -1;

        int left = 0, right = size - 1;
        while(left <= right) {
            System.out.println("Inside while block");
            int middle = (right - left) / 2;

            if(arr[middle] > element) {
                right = middle - 1;
            }
            else if(arr[middle] < element) {
                left = middle + 1;
            }
            else {
                index = middle;
                break;
            }
        }

        if(index != -1) {
            System.out.println("Element found at index: " + index);
        }
        else {
            System.out.println("Element not found.");
        }
    }
}
