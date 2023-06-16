package org.example.dynamic;

public class BestTimeToBuyAndSellStockImpl
{

    public static int maxProfit(int[] prices)
    {
        int profit = 0;

        for (int i = 0; i < prices.length; i++)
        {
            profit = Math.max(profit, getProfit(i, prices));
        }
        return profit;
    }

    private static int getProfit(int buyIndex, int[] prices)
    {
        int profit = 0;
        for (int i = buyIndex + 1; i < prices.length; i++)
        {
            if (prices[i] > prices[buyIndex])
            {
                profit = Math.max(profit, prices[i] - prices[buyIndex]);
            }
        }
        return profit;
    }

}
