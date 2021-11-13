package QnASessionNov13;

/*
Question:
Given an array of N strings, find the longest common prefix among all strings present in the array.

Sample Input:
4
geeksforgeeks geeks geek geezer

Sample Output:
gee

Sampel Input:-
3
a b c

Sample Output:-
-1
 */

import java.util.Scanner;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        scanner.nextLine();

        String stringArr[] = new String[N];
        int minimumLength = Integer.MAX_VALUE;

        for(int i = 0; i < N; i++) {
            stringArr[i] = scanner.nextLine();

            int length = stringArr[i].length();
            if(length < minimumLength) {
                minimumLength = length;
            }
        }

        String answer = "";

        for(int i = 0; i < minimumLength; i++) {
            boolean flag = true;

            for(int j = 1; j < N; j++) {
                if(stringArr[j].charAt(i) != stringArr[j - 1].charAt(i)) {
                    flag = false;
                    break;
                }
            }
            if(flag) {
                answer = answer + stringArr[i].charAt(i);
            }
            else {
                break;
            }
        }

        if(answer.length() > 0) {
            System.out.println(answer);
        }
        else {
            System.out.println("-1");
        }
    }
}
