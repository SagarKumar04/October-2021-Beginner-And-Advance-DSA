package Recursion.Sorting;

public class MergeSort {
    static void merge(int arr[], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int L[] = new int[n1];
        int R[] = new int [n2];

        for(int i = 0; i < n1; i++) {
            L[i]  = arr[l + i];
        }
        for(int i = 0; i < n2; i++) {
            R[i] = arr[m + 1 + i];
        }

        int i = 0, j = 0, k = l;

        while(i < n1 && j < n2) {
            if(L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while(i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while(j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    static void sort(int arr[], int l, int r) {
        if(l < r) {
            /*
            find middle element:

            1. (l + r) / 2 -> not advisable
            2. l + (r - l) / 2 -> advisable
            */
            int m = l + (r - l) / 2;
            sort(arr, l, m);
            sort(arr, m + 1, r);

            merge(arr, l, m, r);
        }
    }

    static void printArray(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
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