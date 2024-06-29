class Solution {
    public int removeDuplicates(int[] nums) {
        int ans=0;
        int i=0;
        int j=i+1;
        int k=i+1;
        
        while(j <= nums.length-1)
        {
            if(nums[i] == nums[j])
            {
                j++;
            }
            else
            {
                nums[k]=nums[j];
                i=j;
                j=i+1;
                k++;
            }
        }
        return k;
    }
}