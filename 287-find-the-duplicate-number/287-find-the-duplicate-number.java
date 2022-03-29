class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> numsSet=new HashSet<>();
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
        }
        return 0;
    }
}