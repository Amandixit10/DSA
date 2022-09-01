class Solution {
    ArrayList<Integer> tree[];
    public int countHighestScoreNodes(int[] parent) {
        int n=parent.length;
        tree=new ArrayList[n];
        for(int i=0;i<n;i++)
        {
            tree[i]=new ArrayList<>();
        }
        for(int i=0;i<n;i++)
        {
            if(parent[i]==-1)
            {continue;}
            tree[parent[i]].add(i);
        }
        int size[]=new int[n];
        long total[]=new long[n];
        int sizeRoot=findSize(0,-1,size,total);
        long max=0;
        int count=0;
        for(int i=0;i<n;i++)
        {
            long val=total[i];
        //    System.out.println(i+" "+val);
            if(i!=0)
            {
              val*=size[0]-size[i];  
            }
            if(val==max)
            {count++;}
            else if(val>max)
            {
                max=val;
                count=1;
            }
        }
        return count;
    }
    int findSize(int src,int par,int size[],long total[])
    {
        int val=0;
        long tot=1;
        for(int i:tree[src])
        {
            int x=findSize(i,src,size,total);
            tot*=x;
            val+=x;
        }
        size[src]=val+1;
        total[src]=tot;
        return val+1;
    }
}