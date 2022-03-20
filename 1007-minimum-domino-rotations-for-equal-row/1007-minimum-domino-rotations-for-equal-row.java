class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        Map<Integer,Integer> topFreqMap=new HashMap<>();
        Map<Integer,Integer> bottomFreqMap=new HashMap<>();
        int maxCount=0;int freqNo=0;
        int bottomMaxCount=0;int bottomFreqNo=0;
        for(int i=0;i<tops.length;i++)
        {
          
             topFreqMap.put(tops[i],topFreqMap.getOrDefault(tops[i],0)+1);
            bottomFreqMap.put(bottoms[i],bottomFreqMap.getOrDefault(bottoms[i],0)+1);
            if(topFreqMap.get(tops[i]) > maxCount){ 
                maxCount=topFreqMap.get(tops[i]); 
                freqNo=tops[i];
            }
            if(bottomFreqMap.get(bottoms[i]) > bottomMaxCount){ 
                bottomMaxCount=bottomFreqMap.get(bottoms[i]); 
                bottomFreqNo=bottoms[i];
            }
        }
        boolean canTopSame=true;int count=0;
        for(int i=0;i<tops.length;i++)
        {
            if((tops[i] != freqNo && bottoms[i] !=freqNo))
            {
                canTopSame=false;
                break;
            }
            else if(tops[i] != freqNo && bottoms[i] ==freqNo)
            {
                count++;
            }
        } 
        
        boolean canBottomSame=true;int bottomCount=0;
        for(int i=0;i<bottoms.length;i++)
        {
            if((bottoms[i] != bottomFreqNo && tops[i] !=bottomFreqNo))
            {
               canBottomSame=false;
                break;
            }
            else if((bottoms[i] != bottomFreqNo && tops[i]==bottomFreqNo))
            {
                bottomCount++;
            }
        } 
        
        if(canTopSame && (bottomCount==0 || count<bottomCount))
            return count;
        else if(canBottomSame && (count==0 || bottomCount<count))
            return bottomCount;
        else if((canTopSame || canBottomSame) && count==bottomCount)
            return count;
        else
            return -1;
    }
}