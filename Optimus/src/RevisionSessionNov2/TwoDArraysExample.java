package RevisionSessionNov2;

public class TwoDArraysExample {
    public static void main(String[] args) {
        /*
        Syntax: data-type array-name[][] = new data-type[rowSize][columnSize];
         */
        int rowSize = 4;
        int columnSize = 5;
        int arr[][] = new int[rowSize][columnSize];

        for(int i = 0; i < rowSize; i++) {
            for(int j = 0; j < columnSize; j++) {
                int element = (int)(Math.random() * 100);
                arr[i][j] = element;
            }
        }

        //Using 'for' loop
        System.out.println("Elements (using 'for' loop) are: ");
        for(int i = 0; i < rowSize; i++) {
            for(int j = 0; j < columnSize; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        //Using 'for-each' loop
        System.out.println("Elements (using 'for-each' loop) are: ");
        for(int currentRow[] : arr) {
            for(int currentElement : currentRow) {
                System.out.print(currentElement + " ");
            }
            System.out.println();
        }
    }
}
