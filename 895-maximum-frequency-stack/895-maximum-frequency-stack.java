class FreqStack {

    int maxFreq;
    HashMap<Integer,Integer> freq;
    HashMap<Integer,Stack<Integer>> stackMap;
    
    public FreqStack() {
        maxFreq=0;
        freq=new HashMap<>();
        stackMap=new HashMap<>();
    }
    
    public void push(int val) {
        freq.put(val,freq.getOrDefault(val,0)+1);
        maxFreq=Math.max(maxFreq,freq.get(val));
        
        if(!stackMap.containsKey(freq.get(val))) stackMap.put(freq.get(val),new Stack<Integer>());
        stackMap.get(freq.get(val)).add(val);
    }
    
    public int pop() {
        int x=stackMap.get(maxFreq).pop();
        if(stackMap.get(maxFreq).isEmpty()) maxFreq--;
        freq.put(x,freq.getOrDefault(x,0)-1);
        return x;
    }
}