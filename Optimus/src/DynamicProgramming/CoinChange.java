package DynamicProgramming;

public class CoinChange {
    private static void printArray(int coinTable[]) {
        for(int i = 0; i < coinTable.length; i++) {
            System.out.printf("%3d", coinTable[i]);
        }
        System.out.println();
    }

    private static int getNumberOfWays(int[] coins, int amount) {
        int coinTable[] = new int[amount + 1];
        int numberOfWays = 0;

        coinTable[0] = 1;
        for(int i = 0; i < coins.length; i++) {
            for(int j = coins[i]; j <= amount; j++) {
                coinTable[j] = coinTable[j] + coinTable[j - coins[i]];
            }
        }

        numberOfWays = coinTable[amount];

        printArray(coinTable);

        return numberOfWays;
    }
    public static void main(String[] args) {
        int amount = 11;
        int coins[] = {1, 2, 5};

        int numberOfWays = getNumberOfWays(coins, amount);

        System.out.println("Number of ways: " + numberOfWays);
    }
}
