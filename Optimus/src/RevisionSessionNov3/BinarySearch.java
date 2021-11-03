package RevisionSessionNov3;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {-9, 1, 11, 19, 30, 34, 75, 87, 100};
        int length = arr.length;
        int elementToBeSearched = 11;
        int left = 0;
        int right = length - 1;
        int index = -1;

        while(left <= right) {
            int middle = left + (right - left) / 2;

            if(arr[middle] < elementToBeSearched) {
                left = middle + 1;
            }
            else if(arr[middle] > elementToBeSearched) {
                right = middle - 1;
            }
            else {
                index = middle;
                break;
            }
        }

        if(index != -1) {
            System.out.println("Element " + elementToBeSearched +
                    " found at index: " + index);
        }
        else {
            System.out.println("Element not found.");
        }
    }
}
