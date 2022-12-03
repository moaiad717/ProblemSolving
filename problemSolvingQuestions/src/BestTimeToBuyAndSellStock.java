/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 */
public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int left =0;
        int right =1;
        int maxProfit=0;

        while (right < prices.length){
            int profit=0;
            if (prices [left]< prices[right]) {
                profit = prices[right] - prices[left];
            maxProfit = Math.max(profit,maxProfit);
            }
            else {
                left =right;
            }

            right+=1;
        }

        return maxProfit;
    }
}
