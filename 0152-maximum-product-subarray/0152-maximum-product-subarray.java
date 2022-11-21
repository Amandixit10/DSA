class Solution {
    int max=Integer.MIN_VALUE;
    public int maxProduct(int[] nums) {
        int n=nums.length;
        List<Integer> list=new ArrayList<>();
        list.add(-1);
        for(int i=0;i<n;i++)
        {
            if(nums[i]==0)
            {
                list.add(i);
            }
        }
        for(int i=0;i<list.size()-1;i++)
        {
            max=Math.max(max,helper(list.get(i)+1,list.get(i+1)-1,nums));
        }
        max=Math.max(max,helper(list.get(list.size()-1)+1,n-1,nums));
        return list.size()==1?max:Math.max(max,0);
    }
    int helper(int l,int r,int ar[])
    {
        TreeSet<Integer> neg=new TreeSet<>();
        int prod=1;
        for(int i=l;i<=r;i++)
        {
         prod*=ar[i];
            if(prod<0)
            {
                if(neg.size()==0)
                {
                max=Math.max(max,prod);
                }
                else{
                    max=Math.max(max,(prod*-1)/neg.first());
                }
                neg.add(Math.abs(prod));
            }
            else{
                max=Math.max(max,prod);
            }
        }
        return max;
    }
}