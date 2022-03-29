class Solution {
    public int findDuplicate(int[] nums) {
        /*Set<Integer> numsSet=new HashSet<>();
        for(Integer num :nums)
        {
            if(numsSet.contains(num))
            {
                return num;
            }
            else
            {
                numsSet.add(num);
            }
        }*/
        
        Arrays.sort(nums);
        int i=0;
        int j=i+1;
        while(j < nums.length)
        {
            //System.out.println("i ^ j = " + (nums[i] ^ nums[j]));
            if((nums[i] ^ nums[j])==0)
            {
                return nums[i];
            }
            i++;
            j++;
        }
        return 0;
    }
}