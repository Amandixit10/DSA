class Solution {
    public int[] constructArray(int n, int k) {
        int idx=1;
        int count=k;
        int i=0;
        TreeSet<Integer> set=new TreeSet<>();
        for(int j=1;j<=n;j++)
        {
            set.add(j);
        }
        int ar[]=new int[n];
       while(count>0)
       {
            ar[i]=idx;
            ar[i+1]=idx+count;
           set.remove(idx);
           set.remove(idx+count);
            count-=2;
           idx+=1;
           i+=2;
        }
      for(int j:set)
      {
          ar[i]=j;
          i++;
      }
        return ar;
    }
}