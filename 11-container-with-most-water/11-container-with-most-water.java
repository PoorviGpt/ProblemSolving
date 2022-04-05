class Solution {
    public int maxArea(int[] height) {
        int maxArea=0;
        int ans=0;
        int i=0,j=height.length-1;
        
        while(i < j)
        {
           ans = Math.max(ans,(j-i)*Math.min(height[i], height[j]));
			if(height[i]<height[j]) i++;
			else j--;
        }
        return ans;
    }
}