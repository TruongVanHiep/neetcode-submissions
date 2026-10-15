class Solution {
    public int maxProfit(int[] prices) {
        int maxP = 0;
        int minBuy = prices[0];
        for(int sell : prices){
            maxP = Math.max(sell - minBuy, maxP);
            minBuy = Math.min(sell, minBuy);
        }
        return maxP;
    }
}
