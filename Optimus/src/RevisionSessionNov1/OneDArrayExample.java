package RevisionSessionNov1;

//1. Import Scanner class
import java.util.Scanner;

public class OneDArrayExample {
    public static void main(String[] args) {
        int size = 4;
        //Syntax: data-type array-name[] = new data-type[size];
        float arr[] = new float[size];

        //2. Create an object of Scanner class
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter values of the array: ");
        for(int i = 0; i < size; i++) {
            arr[i] = scanner.nextFloat();
        }

        System.out.println("Values of array are: ");
        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
