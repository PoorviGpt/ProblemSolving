class Solution {
    public int[][] merge(int[][] intervals) {
        Stack<int[]> mergeInterval=new Stack<>();
        
        Arrays.sort(intervals, Comparator.comparingDouble(o -> o[0]));
        mergeInterval.push(intervals[0]);
        
        for(int[] interval : intervals)
        {
            int[] top=mergeInterval.peek();
            if(interval[0] <= top[1] )
            {
                mergeInterval.pop();
                top[1]=interval[1] > top[1] ? interval[1] : top[1];
                mergeInterval.push(top);
            }
            else
            {
                mergeInterval.push(interval);
            }
        }
        
        int i=0;
        int[][] output=new int[mergeInterval.size()][2];
        while(!mergeInterval.empty())
        {
            output[i]=mergeInterval.pop();
            i++;
        }
        
        return output;
    }
}