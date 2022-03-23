package leetcode.easy;

/**
 * Difficulty: Easy
 *
 * @see <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock/">LeetCode: Best Time to Buy and Sell Stock</a>
 */
public class BestTimeToBuyAndSellStock {

    public static int maxProfit(int[] prices) {
        int min = prices[0];
        int max = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min)
                min = prices[i];
            else if (prices[i] > min)
                max = Math.max(max, prices[i] - min);
        }
        return max;
    }
}
