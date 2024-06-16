class Solution {
    Map<Integer, Integer> mp=new HashMap<>();
   
    public int climbStairs(int n) {
        
        if(mp.containsKey(n))
        {
           return mp.get(n);
        }
        if(n==1)
        {
            mp.put(1,1);
            return 1;
        }
        if(n==2)
        {
            mp.put(2,2);
            return 2;
        }
        int steps=climbStairs(n-2) + climbStairs(n-1);
        mp.put(n, steps);
        return steps;
    }
}