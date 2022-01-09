package DynamicProgramming.NSAssignmentOne;

import java.util.Scanner;

public class SticklerThief {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for(int i = 1; i <= T; i++) {
            int n = scanner.nextInt();

            int current = 0;
            int currentMinusOne = 0;
            int currentMinusTwo = 0;
            for(int j = 1; j <= n; j++) {
                current = scanner.nextInt();

                if(j == 1) {

                }
                else if(j == 2) {
                    current = Math.max(current, currentMinusOne);
                }
                else {
                    current = Math.max(current + currentMinusTwo, currentMinusOne);
                }

                currentMinusTwo = currentMinusOne;
                currentMinusOne = current;
            }

            System.out.println(current);
        }
    }
}
