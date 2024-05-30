class Solution {
    public int maxProfit(int[] prices) {
        int minPrice=prices[0];
        int maxPrice=prices[0];
        int currMaxProfit=0;
        int maxProfit=0;
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i] < minPrice)
            {
                minPrice=prices[i];
                maxPrice=0;
            }
            if(prices[i] > maxPrice)
            {
                maxPrice=prices[i];
            }
            currMaxProfit=Math.abs(maxPrice-minPrice);
            if(currMaxProfit > maxProfit)
                maxProfit=currMaxProfit;
        }
        return maxProfit;
    }
}