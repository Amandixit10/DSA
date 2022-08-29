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
        int indegree[]=new int[n];
        for(int i=0;i<m;i++)
        {
            int u=prerequisites[i][0];
            int v=prerequisites[i][1];
            graph[v].add(u);
            indegree[u]++;
        }
        ArrayDeque<Integer> q=new ArrayDeque<>();
        for(int i=0;i<n;i++)
        {
            if(indegree[i]==0)
            {
                q.add(i);
            }
        }
        int ans[]= new int[n];
        int idx=0;
        while(q.size()>0)
        {
         int num=q.remove();
            ans[idx]=num;
            idx++;
            for(int i:graph[num])
            {
                indegree[i]--;
                if(indegree[i]==0)
                {
                    q.add(i);
                }
            }
        }
        if(idx!=n)
        {
            return new int[0];
        }
        return ans;
        }
}