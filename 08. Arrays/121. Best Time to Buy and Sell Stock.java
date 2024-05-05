class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int buy = prices[0];

        for(int i=1;i<prices.length;i++){
            buy = Math.min(buy,prices[i]);
            profit = Math.max(profit, prices[i] - buy);
          
            // above two lines can also be written like this
            // if( prices[i] < buy)
            // {
            //   buy = prices[i];
            // }
            // if( prices[i] - buy > profit)
            // {
            //   profit = prices[i] - buy;
            // }
          
        }
        return profit;
    }
}
