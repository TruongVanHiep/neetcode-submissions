class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }
        int minPrice = prices[0];
        int maxProfit = 0;
        for(int i = 1; i < prices.length; i++){
            if(minPrice > prices[i]){
                minPrice = prices[i];
            }else{
                int loi = prices[i] - minPrice;
                maxProfit = Math.max(loi, maxProfit);
            }
        }
        return maxProfit;
    }
}
