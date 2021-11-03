package RevisionSessionNov3;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {19, 11, 30, 1, -9, 87, 100, 34, 75};
        int length = arr.length;
        int elementToBeSearched = 30;
        int indexOfElement = -1;

        for(int i = 0; i < length; i++) {
            if(arr[i] == elementToBeSearched) {
                indexOfElement = i;
                break;
            }
        }

        if(indexOfElement != -1) {
            System.out.println("Element " + elementToBeSearched +
                    " is found at index: " + indexOfElement);
        }
        else {
            System.out.println("Element not found.");
        }
    }
}
