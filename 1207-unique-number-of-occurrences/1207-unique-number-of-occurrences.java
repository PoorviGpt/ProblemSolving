class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> hMap=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
             hMap.putIfAbsent(arr[i], 0);
             hMap.put(arr[i], hMap.get(arr[i])+1);
        }

        Set<Integer> uniqueCount=new HashSet<>();
        boolean result=true;
        for(Map.Entry<Integer,Integer> m : hMap.entrySet())
        {
            if(uniqueCount.contains(m.getValue()))
            {
                result= false;
            }
            else
            {
                uniqueCount.add(m.getValue());
            }
        }
        return result;
    }
}