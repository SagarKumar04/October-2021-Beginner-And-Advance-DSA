package RevisionSessionNov1;

public class MaximumNumberInArray {
    public static void main(String[] args) {
        int size = 10;
        int arr[] = new int[size];
        for(int i = 0; i < size; i++) {
            int element = (int)(Math.random() * 100);
            arr[i] = element;
        }

        int maxElement = arr[0];
        for(int i = 1; i < size; i++) {
            if(arr[i] > maxElement) {
                maxElement = arr[i];
            }
        }

        System.out.println("Elements of the array are: ");
        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("Max Element: " + maxElement);
    }
}
