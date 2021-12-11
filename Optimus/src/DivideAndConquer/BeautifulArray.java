package DivideAndConquer;

/*
Link: https://leetcode.com/problems/beautiful-array/
 */

public class BeautifulArray {
    public int[] conquer(int oddArray[], int evenArray[]) {
        int oddLength = oddArray.length;
        int evenLength = evenArray.length;

        int conqueredArray[] = new int[oddLength + evenLength];
        int j = 0;

        for(int i = 0; i < oddLength; i++) {
            conqueredArray[j] = oddArray[i];
            j++;
        }
        for(int i = 0; i < evenLength; i++) {
            conqueredArray[j] = evenArray[i];
            j++;
        }

        return conqueredArray;
    }

    public int[] divide(int originalArray[]) {
        int totalLength = originalArray.length;
        if(totalLength >= 3) {
            int evenLength = totalLength / 2;
            int oddLength = totalLength - evenLength;

            int oddArray[] = new int[oddLength];
            int evenArray[] = new int[evenLength];

            for(int i = 0; i < totalLength; i++) {
                if(i % 2 == 0) {
                    oddArray[i / 2] = originalArray[i];
                }
                else {
                    evenArray[i / 2] = originalArray[i];
                }
            }

            int beautifulOddArray[] = divide(oddArray);
            int beautifulEvenArray[] = divide(evenArray);

            originalArray = conquer(beautifulOddArray, beautifulEvenArray);
        }

        return originalArray;
    }

    public int[] beautifulArray(int n) {
        int originalArray[] = new int[n];

        for(int i = 0; i < n; i++) {
            originalArray[i] = i + 1;
        }

        originalArray = divide(originalArray);

        return originalArray;
    }
    public static void main(String[] args) {
        int n = 10;

        BeautifulArray beautifulArray = new BeautifulArray();
        int result[] = beautifulArray.beautifulArray(n);



        System.out.println("Beautiful Array: ");
        for(int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }
}