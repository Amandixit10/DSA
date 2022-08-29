class Solution {
    ArrayList<Integer> graph[];
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int n=numCourses;
        graph=new ArrayList[n];
        for(int i=0;i<n;i++)
        {
            graph[i]=new ArrayList<>();
        }
        int m=prerequisites.length;
        for(int i=0;i<m;i++)
        {
            int u=prerequisites[i][0];
            int v=prerequisites[i][1];
            graph[v].add(u);
        }
        boolean visited[]=new boolean[n];
        for(int i=0;i<n;i++)
        {
            if(!visited[i])
            {
       cycle(i,visited);
            }
        }
        if(flag)
        {return new int[0];}
        int ans[]=new int[n];
        int idx=0;
        while(st.size()>0)
        {
            ans[idx]=st.pop();
            idx++;
        }
        return ans;
        }
    Stack<Integer> st=new Stack<>();
    HashSet<Integer> set=new HashSet<>();
    boolean flag=false;
  void cycle(int idx,boolean visited[])
    {
     
        if(visited[idx]||flag)
        {
            if(!set.contains(idx))
            {flag=true;}
            return;
        }
      visited[idx]=true;
      for(int i:graph[idx])
      {
          cycle(i,visited);          
      }
      st.add(idx);
      set.add(idx);
    }
}