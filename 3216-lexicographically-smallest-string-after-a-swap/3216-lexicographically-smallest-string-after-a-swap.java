class Solution {
    public String getSmallestString(String s) {
        int i=0;char c;
        char[] sChars = s.toCharArray();
        for(int j=1;j<s.length();j++)
        {
            if(sChars[i] > sChars[j] && 
               ((sChars[i]%2==0 && sChars[j]%2==0) || (sChars[i] %2 != 0 && sChars[j] %2 != 0)))
            {
                c=sChars[i];
                sChars[i]=sChars[j];
                sChars[j]= c;
                
                break;
            }
            i++;
        }
        return String.valueOf(sChars);
    }
}