class Solution {
    public int missingNumber(int[] nums) {
        
        if(nums.length==1)
            return nums[0]==0 ? 1 :0;
        
        Arrays.sort(nums);
        int i=0;
        int j=i+1;
        while(j < nums.length)
        {
            //System.out.println("i ^ j = " + (nums[i] ^ nums[j]));
            if((nums[j]-nums[i]) != 1)
            {
                return nums[j]-1;
            }
            i++;
            j++;
        }
        
        
        return nums[nums.length-1] == nums.length ? 0 : nums.length;
    }
}