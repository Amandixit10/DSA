
// time complexity 9*

class Solution {
    TreeSet<Integer> set=new TreeSet<>();
    public int[] numsSameConsecDiff(int n, int k) {
        for(int i=1;i<=9;i++)
        {
            helper(n-1,k,i+"",i+k);
            helper(n-1,k,i+"",i-k);
        }
        int ans[]=new int[set.size()];
        int idx=0;
        for(int i:set)
        {
         ans[idx]=i;
            idx++;
        }
        return ans;
    }
    void helper(int n,int k,String asf,int curr)
    {
        if(n<=0||curr>9||curr<0)
        {
            if(n==0)
            {
        set.add(Integer.parseInt(asf));
            }
            return;
        }
        helper(n-1,k,asf+curr+"",curr+k);
        helper(n-1,k,asf+curr+"",curr-k);
    }
}