package DoubtSessionOctober30;

public class JaggedArrayExample {
    public static void main(String[] args) {
        int arr[][] = new int[4][];
        for(int i = 0; i < 4; i++) {
            int size = (int)(Math.random() * 10);
            arr[i] = new int[size];
        }

        for(int i = 0; i < 4; i++) {
            int size = arr[i].length;
            System.out.println("Size: " + size);
        }
    }
}
