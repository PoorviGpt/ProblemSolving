class Solution {
    public int minGroups(int[][] intervals) {
        int size=-1;
        int grp=0;
        for(int[] a:intervals)
        {
            size=Math.max(size,a[1]);
        }
        int[] ans=new int[size+2];
        for(int[] a:intervals)
        {
            ans[a[0]]+=1;
            ans[a[1]+1]-=1;
        }
        int l=0;
        for(int i=0;i<=size;i++)
        {
            l+=ans[i];
            grp=Math.max(grp,l);
        }
        return grp;
    }
}