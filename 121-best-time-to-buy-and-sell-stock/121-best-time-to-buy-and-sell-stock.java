class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MIN_VALUE;
        int max=0;
        
        int maxProfit=0;
        int currProfit=0;
        
        int maxIndex=0;
        int minIndex=0;
        
        for(int i=0;i<prices.length;i++)
        {
           if(min==Integer.MIN_VALUE || prices[i] < min && i!=prices.length-1)
           {
               min=prices[i];
               minIndex=i;
           }
           if(min<prices[i] && i>minIndex)
           {
               max=prices[i];
               maxIndex=i;
           }
           
           //System.out.println("min and max and minIndex and maxIndex "+min+" "+max+" "+minIndex+" "+maxIndex);
            
           if(minIndex<maxIndex)
           {
              currProfit=max-min;
           }
            
           if(currProfit > maxProfit)
           {
              maxProfit=currProfit;
           }
        }
        
        
        return maxProfit;
    }
}