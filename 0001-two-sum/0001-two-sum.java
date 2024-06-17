class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> numMap=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(numMap.containsKey(target-nums[i]))
                return new int[]{i, numMap.get(target-nums[i])};
            else
                numMap.put(nums[i], i);
        }
        return new int[]{};
    }
}