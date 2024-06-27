class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> mp=new HashSet<>();
        int maxSeq=0;
        for(int num : nums)
        {
            mp.add(num);
        }
        for (int i=0;i<nums.length;i++)
        {
            int seqLength=1;
            
            int num=nums[i];
            while(mp.contains(num-1))
            {
               seqLength++;
               mp.remove(num-1);
               num--; 
            }
            num=nums[i];
            while(mp.contains(num+1))
            {
               seqLength++;
               mp.remove(num+1);
               num++; 
            }
            if(seqLength > maxSeq)
                maxSeq=seqLength;
        }
        return maxSeq;
    }
}