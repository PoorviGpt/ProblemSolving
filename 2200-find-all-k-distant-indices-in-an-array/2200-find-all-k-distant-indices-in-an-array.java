class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> keyIndexes=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==key)
                keyIndexes.add(i);
        }
        List<Integer> kDistantIndexes=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<keyIndexes.size();j++)
            {
                //System.out.println("i : "+i+" j: "+j +" Math.abs(i-j) "+Math.abs(i-j));
                if(Math.abs(i-keyIndexes.get(j)) <= k)
                {
                    kDistantIndexes.add(i);
                    break;
                }
            }
        }
        return kDistantIndexes;
    }
}