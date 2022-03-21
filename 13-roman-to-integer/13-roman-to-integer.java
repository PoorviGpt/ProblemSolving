class Solution {
    public int romanToInt(String s) {
        int i=0;
        int num=0;
        while(i<s.length()){
            char c=s.charAt(i);
            i++;
            switch(c){
                case 'M':
                    num=num+1000;
                    break;
                case 'D':
                    num=num+500;
                    break;
                case 'C':
                	if(i<s.length() && (s.charAt(i)=='D' || s.charAt(i)=='M'))
                    {
                        num=num+checkForC(s.charAt(i));
                        i++;
                    }
                    else
                     num=num+100;
                    break;
                case 'L':
                     num=num+50;
                    break;
                case 'X':
                	if(i<s.length() && (s.charAt(i)=='L' || s.charAt(i)=='C'))
                    {
                        num=num+checkForX(s.charAt(i));
                        i++;
                    }
                    else
                        num=num+10;
                    break;
                case 'V':
                     num=num+5;
                    break;
                case 'I':
                    if(i<s.length() && (s.charAt(i)=='V' || s.charAt(i)=='X'))
                    {
                        num=num+checkForI(s.charAt(i));
                        i++;
                    }
                    else
                        num=num+1;
                    break;
                default:
                    break;
            }
            
        }
        return num;
    }
    private int checkForI(char next)
    {
        switch(next){
          case 'V':
                return 4;
		case 'X':
                return 9;
		default :
                break;
        }
        return 0;
    }
    private int checkForX(char next)
    {
        switch(next){
          case 'L':
                return 40;
          case 'C':
                return 90;
          default :
                break;
        }
        return 0;
    }
    private int checkForC(char next)
    {
        switch(next){
          case 'D':
                return 400;
          case 'M':
                return 900;
          default :
                break;
        }
        return 0;
    }
}