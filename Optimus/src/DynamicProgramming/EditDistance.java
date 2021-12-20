package DynamicProgramming;

public class EditDistance {
    private static void printMatrix(int operations[][]) {
        System.out.println();
        System.out.println();

        for(int i = 0; i < operations.length; i++) {
            for(int j = 0; j < operations[0].length; j++) {
                System.out.printf("%3d", operations[i][j]);
            }
            System.out.println();
        }
    }

    private static int getMinimumOperations(String s1, String s2) {
        int minimumOperations = 0;
        int length1 = s1.length();
        int length2 = s2.length();

        int operations[][] = new int[length1 + 1][length2 + 1];

        for(int i = 0; i <= length1; i++) {
            for(int j = 0; j <= length2; j++) {
                if(i == 0) {
                    operations[i][j] = j;
                }
                else if(j == 0) {
                    operations[i][j] = i;
                }
                else if(s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    operations[i][j] = operations[i - 1][j - 1];
                }
                else {
                    operations[i][j] = 1 +
                            Math.min(
                            operations[i][j - 1],
                            Math.min(operations[i - 1][j],
                                     operations[i - 1][j - 1])
                            );
                }
            }
        }

        printMatrix(operations);

        minimumOperations = operations[length1][length2];
        return minimumOperations;
    }
    public static void main(String[] args) {
        String s1 = "pqqrst";
        String s2 = "qqttps";
        int minimumOperations = getMinimumOperations(s1, s2);

        System.out.println("Minimum Number of Operations Required: " + minimumOperations);
    }
}
