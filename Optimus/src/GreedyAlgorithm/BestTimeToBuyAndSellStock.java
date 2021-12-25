package GreedyAlgorithm;
/*
URL: https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
 */
public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int profit = 0;

        for(int i = 1; i < prices.length; i++) {
            if(prices[i] > prices[i - 1]) {
                int difference = prices[i] - prices[i - 1];

                profit = profit + difference;
            }
        }

        return profit;
    }

    public static void main(String[] args) {
        BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock
                = new BestTimeToBuyAndSellStock();

        int prices[] = {5, 4, 3, 2, 1};

        int maxProfit = bestTimeToBuyAndSellStock.maxProfit(prices);

        System.out.println(maxProfit);
    }
}
