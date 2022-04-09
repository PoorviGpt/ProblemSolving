class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=0;
        int n=0;
        int res[]=new int[nums1.length+nums2.length];
        int c=0;
        while(m<nums1.length && n<nums2.length)
        {
            if(nums1[m] < nums2[n])
            {
                res[c]=nums1[m];
                m++;
            }
            else
            {
                res[c]=nums2[n];
                n++;
            }
            c++;
        }
        while(m<nums1.length)
        {
            res[c]=nums1[m];
            m++;c++;
        }
        while(n<nums2.length)
        {
            res[c]=nums2[n];
            n++;c++;
        }
        System.out.println("result "+Arrays.toString(res));
         int pos=(m+n)/2;
        if((m+n)%2==0)
        {
            return (res[pos]*1.0+res[pos-1]*1.0)/2;
        }
        else
        {
            return res[pos];
        }
    }
}