package QnASessionNov13;

/*
Question:
Abhijit has an Array Arr which may or may not be in strictly increasing order. He wants to make this array increasing but does not wish to change the position of any element so he came with an idea that he will replace an element with any of its divisors i.e he changes an element X to M if X%M=0.

Your task is to tell whether the given array can be transformed to strictly increasing by performing the operation given above.

Sample Input:-
5
1 2 16 16 16

Sample Output:-
YES

Sample Input:-
4
1 3 8 4

Sample Output:-
NO
 */

import java.util.Scanner;

public class IncreasingArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int array[] = new int[N];

        for(int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }

        array[0] = 1;
        for(int i = 1; i < N; i++) {
            int start = array[i - 1] + 1;
            int end = array[i] / 2;

            for(int j = start; j <= end; j++) {
                if(array[i] % j == 0) {
                    array[i] = j;
                    break;
                }
            }
        }

        boolean flag = true;
        for(int i = 1; i < N; i++) {
            if(array[i - 1] >= array[i]) {
                flag = false;
                break;
            }
        }

        if(flag) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
