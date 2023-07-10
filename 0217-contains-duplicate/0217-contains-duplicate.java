class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> s=new HashSet<>();
        for(Integer a : nums)
        {
            if(s.contains(a))
                return true;
            
            s.add(a);
        }
        return false;
    }
}