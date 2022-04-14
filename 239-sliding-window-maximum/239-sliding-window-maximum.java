class Solution {
    public int[] maxSlidingWindow(int[] arr, int k) {
        Deque<Integer> Qi = new LinkedList<Integer>();
         
        int n=arr.length;
        if(n==1)
        {
            return arr;
        }
        int[] res=new int[n-k+1];
            
        int i;
        int c=0;
        for (i = 0; i < k; ++i)
        {
            // For every element, the previous
            // smaller elements are useless so
            // remove them from Qi
            while (!Qi.isEmpty() && arr[i] >=
                           arr[Qi.peekLast()])
               
                // Remove from rear
                Qi.removeLast();
 
            // Add new element at rear of queue
            Qi.addLast(i);
        }
 
        // Process rest of the elements,
        // i.e., from arr[k] to arr[n-1]
        for (; i < n; ++i)
        {
         
            // The element at the front of the
            // queue is the largest element of
            // previous window, so print it
            res[c]=arr[Qi.peek()];c++;
 
            // Remove the elements which
            // are out of this window
            while ((!Qi.isEmpty()) && Qi.peek() <=
                                             i - k)
                Qi.removeFirst();
 
            // Remove all elements smaller
            // than the currently
            // being added element (remove
            // useless elements)
            while ((!Qi.isEmpty()) && arr[i] >=
                              arr[Qi.peekLast()])
                Qi.removeLast();
 
            // Add current element at the rear of Qi
            Qi.addLast(i);
        }
 
        // Print the maximum element of last window
        res[c]=arr[Qi.peek()];c++;
        return res;
    }
}