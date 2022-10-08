class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();
        List<List<Integer>> list=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(set1.contains(nums[i]))
            {continue;}
            set2=new HashSet<>();
            for(int j=i+1;j<n;j++)
            {
                if(set2.contains(nums[j]))
                {continue;}
            int val=-1*(nums[i]+nums[j]);
if(bs(val,j,nums.length,nums))
{
  List<Integer> x=new ArrayList<>();
    x.add(nums[i]);
    x.add(nums[j]);
    x.add(val);
    list.add(x);
    set2.add(nums[j]);
}
            }
            set1.add(nums[i]);
        }
        return list;
    }
    boolean bs(int val,int l,int r,int ar[])
    {
        int hi=r;
        int lo=l;
        while(hi-lo>1)
        {
            int mid=lo+(hi-lo)/2;
            if(ar[mid]>=val)
            {
                if(ar[mid]==val)
                {return true;}
                hi=mid;
            }
            else{
                lo=mid;
            }
        }
        return false;
    }
}