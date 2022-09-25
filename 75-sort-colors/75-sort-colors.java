class Solution {
    public void sortColors(int[] nums) {
        
        // code here 
        int i=-1;
        for(int j=0;j<nums.length;j++)
        {
            if(nums[j] == 0)
            {
                i++;
                swap(i,j,nums);
            }
        }
       
        //k will be the position where last 0 found
        int k=i;
        for(int j=k+1;j<nums.length;j++)
        {
            if(nums[j] == 1)
            {
                k++;
                swap(k,j,nums);
            }
        }
    }
    static void swap(int i,int j,int[] nums)
    {
    	if(i != j)
    	{
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    	}
    }
}