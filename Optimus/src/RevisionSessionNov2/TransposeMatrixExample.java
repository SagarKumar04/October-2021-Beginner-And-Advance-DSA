package RevisionSessionNov2;

public class TransposeMatrixExample {
    public static void main(String[] args) {
        int rowSize = 4;
        int columnSize = 5;
        int arr[][] = new int[rowSize][columnSize];

        for(int i = 0; i < rowSize; i++) {
            for(int j = 0; j < columnSize; j++) {
                int element = (int)(Math.random() * 100);
                arr[i][j] = element;
            }
        }

        int transpose[][] = new int[columnSize][rowSize];

        for(int i = 0; i < columnSize; i++) {
            for (int j = 0; j < rowSize; j++) {
                transpose[i][j] = arr[j][i];
            }
        }

        System.out.println("Original Array: ");
        for(int i = 0; i < rowSize; i++) {
            for(int j = 0; j < columnSize; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("Transposed Array: ");
        for(int i = 0; i < columnSize; i++) {
            for(int j = 0; j < rowSize; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
