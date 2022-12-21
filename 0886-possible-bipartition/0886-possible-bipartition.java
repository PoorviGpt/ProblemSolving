class Solution {
    Map<Integer,List<Integer>> graph=new HashMap<>();
      
    public boolean possibleBipartition(int n, int[][] dislikes) {
        Queue<Integer> q=new LinkedList<>();
        int[] vis=new int[n+1];
        for(int i=1;i<=n;i++)
       {
           graph.put(i,new ArrayList<Integer>());
       }
       for(int[] dislike:dislikes)
       {
           int src=dislike[0];
           int des=dislike[1];
           graph.get(src).add(des);
            graph.get(des).add(src);
       }
       for(int k=1;k<=n;k++)
       {
                if(vis[k]==0)
                {
                    q.add(k);
                   int level=1;
                    while(!q.isEmpty())
                    {
                        int size=q.size();
                        for(int i=0;i<size;i++)
                        {
                            int par=q.poll();
                            if(level%2!=0)
                            {
                                if(vis[par]==2)
                                {
                                    return false;
                                }
                                vis[par]=1;
                            }

                            if(level%2==0)
                            {
                                if(vis[par]==1)
                                {
                                    return false;
                                }
                                vis[par]=2;
                            }

                            List<Integer> lt=graph.get(par);
                            for(int j=0;j<lt.size();j++)
                            {
                                  if(vis[lt.get(j)]==0)
                                q.add(lt.get(j));
                            }
                            
                        }
                        level++;
                    }
                }
               
        }
     
        System.out.println(Arrays.toString(vis));
        return true;
    }
    
}