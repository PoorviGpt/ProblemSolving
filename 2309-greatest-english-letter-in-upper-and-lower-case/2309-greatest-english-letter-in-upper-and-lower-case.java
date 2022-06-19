class Solution {
    public String greatestLetter(String s) {
        char[] freqLtrs=new char[26];
        char def = '\u0000';
        String output="";
        
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            
            int pos=Character.isUpperCase(c) ? c-'A' : c-'a';
            
           /* System.out.println(c+" "+pos);
            System.out.println("freqLtrs[pos] "+freqLtrs[pos]);
            System.out.println("--"+(Character.isUpperCase(freqLtrs[pos]) && Character.isLowerCase(c))); */
            
            if(freqLtrs[pos] == def)
                freqLtrs[pos]=c;
            else if( (Character.isUpperCase(freqLtrs[pos]) && Character.isLowerCase(c)) || 
                    (Character.isLowerCase(freqLtrs[pos]) && Character.isUpperCase(c)) )
            {
                freqLtrs[pos]='1';
            }
        }
        
        for(int i=25;i>=0;i--)
        {
            if(freqLtrs[i]=='1')
            {
                char o=(char)(i+'A');
                return output+o;
            }
        } 
        
        return output;
    }
}