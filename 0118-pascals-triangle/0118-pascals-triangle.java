class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        
        ans.add(Arrays.asList(1));
        
        for(int i=1;i<numRows;i++)
        {
            List<Integer> row=new ArrayList<>(i+1);
            List<Integer> prevRow=ans.get(i-1);
            
            for(int j=0;j<(i+1);j++)
            {
                if(j==0 || j==i)
                    row.add(1);
                else
                    row.add(prevRow.get(j)+prevRow.get(j-1));
            }
            ans.add(row);
        }
        return ans;
    }
}