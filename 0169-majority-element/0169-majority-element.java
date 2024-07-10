class Solution {
    public int majorityElement(int[] nums) {
        int maj=nums[0];
        int i=1;
        int count=1;
        while(i < nums.length)
        {
            if(nums[i] == maj)
                count++;
            else
                count--;
            
            if(count==0 && i != nums.length-1)
                maj=nums[i+1];
            i++;
        }
        i=0;count=0;
        while(i < nums.length)
        {
            if(nums[i] == maj)
                count++;
            i++;
        }
        System.out.println(maj+" "+count);
        if(count > Math.ceil(nums.length/2))
            return maj;
        return -1;
    }
}