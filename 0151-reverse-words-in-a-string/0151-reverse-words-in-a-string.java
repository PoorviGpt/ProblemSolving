class Solution {
    public String reverseWords(String s) {
        String[] splitArr=s.split("\\s+");
        //System.out.println(Arrays.toString(splitArr));
        String newStr="";
        for(int i=splitArr.length-1;i >= 0 ;i--)
        {
            newStr=newStr+splitArr[i]+" ";
        }
        return newStr.trim();
    }
}