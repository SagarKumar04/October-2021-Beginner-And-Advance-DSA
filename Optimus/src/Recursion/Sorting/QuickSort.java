package Recursion.Sorting;

public class QuickSort {
    static void printArray(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for(int j = low; j < high; j++) {
            if(arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);
        return (i + 1);
    }

    static void sort(int arr[], int low, int high) {
        if(low < high) {
            int pivot = partition(arr, low, high);
            sort(arr, low, pivot - 1);
            sort(arr, pivot + 1, high);
        }
    }

    public static void main(String[] args) {
        int arr[] = {100, -10, 1000, 38, 27, 43, 3, 9, 82, 10};

        System.out.println("Before sorting: ");
        printArray(arr);

        sort(arr, 0, arr.length - 1);

        System.out.println();

        System.out.println("After sorting: ");
        printArray(arr);
    }
}
