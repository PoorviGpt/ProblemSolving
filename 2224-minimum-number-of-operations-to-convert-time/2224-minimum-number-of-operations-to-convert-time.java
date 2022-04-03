class Solution {
    public int convertTime(String current, String correct) {
        int minOpr=0;
        
        String[] currentTimeStr = current.split(":", 2);
        String[] correctTimeStr = correct.split(":", 2);
        int g=Integer.parseInt(currentTimeStr[0]);
        int h=Integer.parseInt(correctTimeStr[0]);
        int currmin=g*60+Integer.parseInt(currentTimeStr[1]);
        int corrmin=h*60+Integer.parseInt(correctTimeStr[1]);
        int minDifference=Math.abs(corrmin-currmin);
         minOpr=minDifference/60+((minDifference%60)/15)+((minDifference%15)/5)+(minDifference%5);
        /*int hrsDifference=Integer.parseInt(correctTimeStr[0])-Integer.parseInt(currentTimeStr[0]);
        int minDifference=Integer.parseInt(correctTimeStr[1])-Integer.parseInt(currentTimeStr[1]);
        
        if(minDifference >= 0 && hrsDifference>=0)
        {
            minOpr=minOpr+hrsDifference;
            minOpr=minOpr+(minDifference/15)+((minDifference%15)/5)+(minDifference%5);
        }
        else
        {
            
            minOpr=minOpr+hrsDifference;
            
            minDifference=59-Math.abs(minDifference);
            minOpr=minOpr+(minDifference/15)+((minDifference%15)/5)+(minDifference%5);
        }
         
            
        */
        
        
        return minOpr;
    }
}