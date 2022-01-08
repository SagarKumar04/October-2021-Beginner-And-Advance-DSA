package DynamicProgramming.NSAssignmentOne;

import java.util.Scanner;

public class SumOfAllSubstrings {
    final static long mod = 1000000007;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String num = scanner.nextLine();
        int length = num.length();

        long previousSum = 0;
        long sum = 0;
        for(int i = 0; i < length; i++) {
            previousSum = ((previousSum * 10) + ((num.charAt(i) - '0') * (i + 1))) % mod;
            sum = (sum + previousSum) % mod;
        }

        System.out.println(sum);
    }
}