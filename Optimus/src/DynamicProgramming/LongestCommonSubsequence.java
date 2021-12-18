package DynamicProgramming;

public class LongestCommonSubsequence {
    private static void printLcsMatrix(int lcs[][]) {
        System.out.println();
        System.out.println();

        for(int i = 0; i < lcs.length; i++) {
            for(int j = 0; j < lcs[0].length; j++) {
                System.out.printf("%3d", lcs[i][j]);
            }
            System.out.println();
        }
    }

    private static int findLengthOfLCS(String s1, String s2) {
        int lengthOfLcs = 0;
        int length1 = s1.length();
        int length2 = s2.length();

        int lcs[][] = new int[length1 + 1][length2 + 1];

        for(int i = 0; i <= length1; i++) {
            for(int j = 0; j <= length2; j++) {
                if(i == 0 || j == 0) {
                    lcs[i][j] = 0;
                }
                else if(s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    lcs[i][j] = lcs[i - 1][j - 1] + 1;
                }
                else {
                    lcs[i][j] = Math.max(
                            lcs[i - 1][j],
                            lcs[i][j - 1]
                    );
                }
            }
        }

        lengthOfLcs = lcs[length1][length2];

        printLcsMatrix(lcs);

        return lengthOfLcs;
    }

    public static void main(String[] args) {
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";

        int lengthOfLcs = findLengthOfLCS(s1, s2);

        System.out.println("Length of LCS: " + lengthOfLcs);
    }
}
