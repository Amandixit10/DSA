class Solution {
    ArrayList<Integer> tree[];
    TreeMap<Long,Integer> map=new TreeMap<>();
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
        int sizeRoot=findSize(0,-1,size);
        for(int i=0;i<n;i++)
        {
            long val=1L;
        for(int j:tree[i])
        {
         val*=size[j];   
        }
            if(i!=0)
            {
              val*=size[0]-size[i];  
            }
            map.put(val,map.getOrDefault(val,0)+1);
        }
        return map.get(map.lastKey());
    }
    int findSize(int src,int par,int size[])
    {
        int val=0;
        for(int i:tree[src])
        {
            val+=findSize(i,src,size);
        }
        size[src]=val+1;
        return val+1;
    }
}