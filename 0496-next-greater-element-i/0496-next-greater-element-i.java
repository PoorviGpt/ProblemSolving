class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> numMap=new HashMap<>();
        for(int i=0;i<nums2.length;i++)
            numMap.put(nums2[i], i);
        
        for(int i=0;i<nums1.length;i++)
        {
            int checkPos=numMap.get(nums1[i])+1;
            boolean isGreaterFound=false;
            while(checkPos < nums2.length && !isGreaterFound)
            {
                if(nums2[checkPos] > nums1[i])
                {
                    nums1[i]=nums2[checkPos];
                    isGreaterFound=true;
                }
                checkPos++;
            }
            if(!isGreaterFound)
                nums1[i]=-1;
        }
        return nums1;
    }
}