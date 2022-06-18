class Solution {
    public int change(int amount, int[] coins) {
        Map<String,Integer> hm=new HashMap<>();
        return helper(coins,amount,0,hm);
    }
    public int helper(int[] coins,int amount,int index,Map<String,Integer> hm)
    {
        if(amount==0)
        {
            return 1;
        }
        if(amount < 0 || index==coins.length)
        {
            return 0;
        }
        int res=0;
        
        String key=amount+"_"+index;
        if(hm.containsKey(key))
            return hm.get(key);
        
        for(int i=index;i<coins.length;i++)
        {
            if(amount >= coins[i])
            {
                res=res+helper(coins,amount-coins[i],i,hm);
            }
        }
        
        hm.put(key,res);
        return res;
    }
}