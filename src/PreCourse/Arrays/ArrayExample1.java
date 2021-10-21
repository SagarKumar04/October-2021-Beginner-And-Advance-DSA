package PreCourse.Arrays;

//1. Import Scanner class
import java.util.Scanner;

public class ArrayExample1 {
    public static void main(String[] args) {
        /*
        Declare: data-type array-name[] = new data-type[size];
         */
        //2. Create an object of Scanner class
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the size: ");
        //3. Use functions of Scanner class to read data from keyboard
        int size = scanner.nextInt();
        //size = 5
        int arr[] = new int[size];
        //arr: 5 -> 0, 1, 2, 3, 4

        //Taking input from the user
        System.out.println("Please enter the elements of the array: ");
        System.out.print("Element: ");
        for(int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        //Printing the output
        System.out.println("Elements of the array are: ");
        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println(arr[2]);
    }
}
