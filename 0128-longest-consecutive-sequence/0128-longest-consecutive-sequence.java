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
            while(mp.contains(--num))
            {
               seqLength++;
               mp.remove(num);
            }
            num=nums[i];
            while(mp.contains(++num))
            {
               seqLength++;
               mp.remove(num);
            }
            
            maxSeq=Math.max(seqLength, maxSeq);
        }
        return maxSeq;
    }
}