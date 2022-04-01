class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String firstStr=strs[0];
        String lastStr=strs[strs.length-1];
        
        int i=0;
        int len=firstStr.length() > lastStr.length() ? lastStr.length() : firstStr.length() ;
        String outputStr="";
        while(i< len)
        {
            if(firstStr.charAt(i) == lastStr.charAt(i))
            {
                outputStr=outputStr+firstStr.charAt(i);
            }
            else
            {
                break;
            }
            i++;
        }
        return outputStr;
    }
}