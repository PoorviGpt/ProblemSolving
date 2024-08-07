class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Integer maj1 = null;
        Integer maj2 = null;
        int count1 = 0;
        int count2 = 0;
        for(int num : nums){
            if(maj1 != null && maj1 == num){
                count1++;
            }else if(maj2 != null && maj2 == num){
                count2++;
            }else if(count1 == 0){
                maj1 = num;
                count1=1;
            }else if(count2 == 0){
                maj2 = num;
                count2=1;
            }else{
                count1--;
                count2--;
            }
        }
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        count1 =0;
        count2 =0;
        for(int num : nums){
            if(maj1!=null&&maj1 == num){count1++;}
            if(maj2!=null&&maj2 == num){count2++;}
        }
        if(count1 > Math.floor(n/3)){ans.add(maj1);}
        if(count2 > Math.floor(n/3)){ans.add(maj2);}
        return ans;

    }
}