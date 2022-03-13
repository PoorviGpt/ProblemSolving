class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> uniqueChars=new HashSet<>();
        Set<Character> uniqueCharsSubStr=new HashSet<>();
        int count=0;
        int maxCount=0;
        for(int i=0;i<s.length();i++)
        {  
            if(uniqueChars.contains(s.charAt(i))){
                if(count>maxCount)
                {
                    maxCount=count;
                }
                
                int j=i-1;
                count=1;
                uniqueCharsSubStr.clear();
                uniqueCharsSubStr.add(s.charAt(i));
               
                while(j>=0 && s.charAt(j)!=s.charAt(i) && !uniqueCharsSubStr.contains(s.charAt(j)) )
                {
                    uniqueCharsSubStr.add(s.charAt(j));
                    count++;
                    j--;
                }
            }
            else
            {
                uniqueChars.add(s.charAt(i));
                count++;
            }
            
             if(maxCount==0 || count >maxCount)
             {
                 maxCount=count;
             }
        }
        
        return maxCount;
    }
}