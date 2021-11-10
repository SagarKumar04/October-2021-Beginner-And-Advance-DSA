package Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {5, 1, 2, 4, 8, 0, 10, 19, 21, -91, 100};

        //1, 2, 3, 4, 5
        int length = arr.length;

        System.out.println("Before swapping");
        for(int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for(int i = 1; i < length; i++) {
            int key = arr[i];

            int j = i - 1;
            while(j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            arr[j + 1] = key;
        }

        System.out.println("After swapping");
        for(int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
