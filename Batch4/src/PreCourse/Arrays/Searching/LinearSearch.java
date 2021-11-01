public class LinearSearch {
    public static void main(String args[]) {
        int arr[] = {16, 10, 25, 84, 9, 56, 100};
        int index = -1;
        int element = 184;
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == element) {
                index = i;
            }
        }
        
        if(index != -1) {
            System.out.println("Element found at: " + index);
        }
        else {
            System.out.println("Element not found.");
        }
    }
}
