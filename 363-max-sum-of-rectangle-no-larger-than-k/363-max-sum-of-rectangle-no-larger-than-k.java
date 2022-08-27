class Solution {
    public int maxSumSubmatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            int ar[]=new int[m];
            for(int j=i;j<n;j++)
            {

                    for(int k=0;k<m;k++)
                    {
                        ar[k]+=matrix[j][k];
                    }
                    max=Math.max(max,helper(ar,target));
            }
            
        }
        return max;
    }
    int helper(int ar[],int k)
    {
        TreeSet<Integer> set=new TreeSet<>();
        int sum=0;
        int max=Integer.MIN_VALUE;
        set.add(0);
        for(int i=0;i<ar.length;i++)
        {
            
            sum+=ar[i];
            int req=sum-k;
                if(set.ceiling(req)!=null)
                {
                    max=Math.max(max,sum-set.ceiling(req));
                }
            set.add(sum);
        }
        return max;
    }
}