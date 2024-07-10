class Solution {
    public int lengthOfLongestSubstring(String s) {
        // int cnt=1;
        int len=0;
        int max_length=0;
        Map<Character, Integer> st=new HashMap<>();
        //st.add(s.charAt(0));
        int n=s.length();
        int right=0;
        
        while(right<n)
        {
                if(!st.containsKey(s.charAt(right))){
                     st.put(s.charAt(right), right);
                     max_length=Math.max(max_length,st.size());
                     right++;
                     
                }else{
                    int pos=st.get(s.charAt(right));
                    right=pos+1;
                    st.clear();
                }
             
          }
         return max_length;
        }
       
    
}