class Solution {
    public boolean validPalindrome(String s) {
        int mismatchCount=0;
        return checkPalindrome(s,0);
    }
    public boolean checkPalindrome(String s,int mismatchCount) {
        int i=0;int j=s.length()-1;
        while(i < j)
        {
            if(s.charAt(i) != s.charAt(j))
            {
               mismatchCount++;
               if((i+1 < j && s.charAt(i+1) != s.charAt(j)) &&
               (j-1 > i && s.charAt(i) != s.charAt(j-1)))
               {
                    return false;
               }
               else if((i+1 < j && s.charAt(i+1) == s.charAt(j)) &&
               (j-1 > i && s.charAt(i) == s.charAt(j-1)))
               {
                   return checkPalindrome(s.substring(i+1,j+1),mismatchCount) || checkPalindrome(s.substring(i,j),mismatchCount);
               }
               else if(j-1 > i && s.charAt(i) == s.charAt(j-1))
               {
                   return checkPalindrome(s.substring(i,j),mismatchCount);
               }
               else if(i+1 < j && s.charAt(i+1) == s.charAt(j))
               {
                   return checkPalindrome(s.substring(i+1,j+1),mismatchCount);
               }
            }
            i++;
            j--;
        }
        
        if(mismatchCount > 1)
            return false;
        return true;
    }
}