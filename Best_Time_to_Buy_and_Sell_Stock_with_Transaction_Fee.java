class Solution {
    public int maxProfit(int[] prices, int fee) {
        
        int cash = 0, hold = -prices[0];
        
        for (int i = 1; i < prices.length; i++) {
        
            int prev_cash = cash;
            
            cash = Math.max(prev_cash, hold + prices[i] - fee);
            
            hold = Math.max(hold, prev_cash - prices[i]);
        }
        return cash;
    }
}
