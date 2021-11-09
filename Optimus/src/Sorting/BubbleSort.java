package Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {5, 1, 2, 4, 8, 0, 10, 19, 21, -91, 100};
        int length = arr.length;

        System.out.println("Before swapping");
        for(int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for(int i = 0; i < length; i++) {
            for(int j = 0; j < (length - i - 1); j++) {
                //compare
                if(arr[j] > arr[j + 1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("After swapping");
        for(int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
