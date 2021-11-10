package Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {5, 1, 2, 4, 8, 0, 10, 19, 21, -91, 100};
        int length = arr.length;

        System.out.println("Before swapping");
        for(int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for(int i = 0; i < length; i++) {
            int minIndex = i;

            for(int j = (i + 1); j < length; j++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        System.out.println("After swapping");
        for(int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
