package LeetCodeQuestion;

/*
URL: https://leetcode.com/problems/coin-change/
 */

public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        int coinTable[] = new int[amount + 1];

        for(int i = 1; i <= amount; i++) {
            int minimum = Integer.MAX_VALUE;

            for(int j = 0; j < coins.length; j++) {
                if(coins[j] <= i) {
                    int remainingAmountMinimum = coinTable[i - coins[j]];

                    if(remainingAmountMinimum != -1) {
                        if(remainingAmountMinimum < minimum) {
                            minimum = remainingAmountMinimum;
                        }
                    }
                }
            }

            if(minimum == Integer.MAX_VALUE) {
                coinTable[i] = -1;
            }
            else {
                coinTable[i] = 1 + minimum;
            }
        }

        return coinTable[amount];
    }

    public static void main(String[] args) {
        int coins[] = {1, 2, 5};
        int amount = 11;

        CoinChange coinChange = new CoinChange();
        int minimumCoinsRequired = coinChange.coinChange(coins, amount);

        System.out.println("Minimum Coins Required: " + minimumCoinsRequired);
    }
}
