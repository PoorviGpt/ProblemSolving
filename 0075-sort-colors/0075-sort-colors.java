class Solution {
    public void sortColors(int[] nums) {
        Map<Integer, Integer> numMap=new HashMap<>();
        
        for(int num : nums)
        {
            numMap.putIfAbsent(num, 0);
            numMap.put(num, numMap.get(num)+1);
        }
        
        int zeroCount=numMap.getOrDefault(0, 0);
        int oneCount=numMap.getOrDefault(1, 0);
        int twoCount=numMap.getOrDefault(2, 0);
        
        int i=0;
        while(zeroCount != 0)
        {
            nums[i]=0;
            i++;zeroCount--;
        }
        
        while(oneCount != 0)
        {
            nums[i]=1;
            i++;oneCount--;
        }
        
        while(twoCount != 0)
        {
            nums[i]=2;
            i++;twoCount--;
        }
    }
}