class Solution {
    ArrayList<Integer> graph[];
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int n=numCourses;
        graph=new ArrayList[n];
        for(int i=0;i<n;i++)
        {
            graph[i]=new ArrayList<>();
        }
        int indegree[]=new int[n];
        for(int i=0;i<prerequisites.length;i++)
        {
            int u=prerequisites[i][0];
            int v=prerequisites[i][1];
         graph[u].add(v);
            indegree[v]++;
        }
        ArrayDeque<Integer> q=new ArrayDeque<>();
        for(int i=0;i<n;i++)
        {
            if(indegree[i]==0)
            {
                q.add(i);
            }
        }
        int size=0;
        while(q.size()>0)
        {
          int num=q.remove();
            size++;
            for(int i:graph[num])
            {
                indegree[i]--;
                if(indegree[i]==0)
                {
                    q.add(i);
                }
            }
        }
        return size==n;
    }
}