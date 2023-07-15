class Solution {
    public int maxProfit(int[] prices) {
        int min, max, diff, max_diff;
        min = max= prices[0];
        max_diff = diff = 0;
        for(int i=1;i<prices.length;i++) {
            if(prices[i]>max) {
                max= prices[i];
                diff = max - min;
            }
            else if(prices[i]<min) {
                min = prices[i];
                max = min;
            }
            if(diff>max_diff) {
                max_diff = diff;
            }
        }

        return max_diff;
    }
}