class Solution {
    ArrayList<Integer> graph[];
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int n=numCourses;
        graph=new ArrayList[n];
        int indegree[]=new int[n];
        for(int i=0;i<n;i++)
        {
            graph[i]=new ArrayList<>();
        }
        for(int i=0;i<prerequisites.length;i++)
        {
            int u=prerequisites[i][0];
            int v=prerequisites[i][1];
                graph[u].add(v);
                indegree[v]=Math.max(indegree[v],0)+1;
            }
        
        ArrayDeque<Integer> q=new ArrayDeque<>();
        for(int i=0;i<n;i++)
        {
            if(indegree[i]==0)
            {q.add(i);}
        //System.out.println(indegree[i]);
        }
        int ans[]=new int[n];
        boolean visited[]=new boolean[n];
        int cnt=0;
        while(q.size()>0)
        {
            int num=q.remove();
         //  System.out.println(num);
            if(visited[num])
            {continue;}
            ans[cnt]=num;
            cnt++;
            visited[num]=true;
            for(int i:graph[num])
            {
                indegree[i]-=1;
                if(indegree[i]==0)
                {
                    q.add(i);
                }
            }
        }
        if(cnt!=n)
        {
            return new int[0];
        }
        int x[]=new int[n];
        for(int i=n-1;i>=0;i--)
        {
            x[i]=ans[n-i-1];
        }
        return x;
    }
}