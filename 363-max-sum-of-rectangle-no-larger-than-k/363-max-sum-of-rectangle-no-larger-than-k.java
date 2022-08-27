class Solution {
    public int maxSumSubmatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        int pre[][]=new int[n][m];
        for(int j=0;j<m;j++)
        {
            for(int i=0;i<n;i++)
            {
                if(i==0)
                {
                    pre[i][j]=matrix[i][j];
                }
                else{
                    pre[i][j]=pre[i-1][j]+matrix[i][j];
                }
            }
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                int ar[]=new int[m];
                if(i==0)
                {
                 max=Math.max(max,helper(pre[j],target));   
                }
                else{
                    for(int k=0;k<m;k++)
                    {
                        ar[k]=pre[j][k]-pre[i-1][k];
                    }
                    max=Math.max(max,helper(ar,target));
                }
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