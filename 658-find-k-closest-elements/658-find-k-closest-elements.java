class Solution {
    class pair{
        int val;
        int dif;
        pair(int val,int dif)
        {
            this.val=val;
            this.dif=dif;
        }
    }
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<pair> pq=new PriorityQueue<>((a,b)->(a.dif==b.dif)?(a.val-b.val):(a.dif-b.dif));
        for(int i=0;i<arr.length;i++)
        {
        pq.add(new pair(arr[i],Math.abs(arr[i]-x)));
        }
        List<Integer> list=new ArrayList<>();
        int i=0;
        while(i<k)
        {
            list.add(pq.remove().val);
            i++;
        }
    Collections.sort(list);
        return list;
    }
}