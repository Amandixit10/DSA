class Solution {
    public int destroyTargets(int[] nums, int space) {
        int n=nums.length;
        int ar[]=new int[n];
     for(int i=0;i<n;i++)
     {
         ar[i]=nums[i]%space;
         //System.out.print(ar[i]+" ");
     }
        TreeMap<Integer,Integer> map=new TreeMap<>();
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->(b[1]-a[1]));
        for(int i=0;i<n;i++)
        {
           map.put(ar[i],map.getOrDefault(ar[i],0)+1);
        }
        for(int i:map.keySet())
        {
            if(pq.size()==0||pq.peek()[1]<=map.get(i))
            {
while(pq.size()>0&&pq.peek()[1]<map.get(i))
{
    pq.remove();
}
                pq.add(new int[]{i,map.get(i)});
            }
            }
        HashSet<Integer> set=new HashSet<>();
        while(pq.size()>0)
        {
            int val=pq.remove()[0];
            set.add(val);
        }
        PriorityQueue<Integer> q=new PriorityQueue<>();
        for(int i=0;i<n;i++)
        {
            if(set.contains(ar[i]))
            {
                q.add(nums[i]);
            }
        }
        return q.remove();
    }
}