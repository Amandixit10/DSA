class Solution {
    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        int count=0;
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
        
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                int ar[]=new int[m];
            if(i==0)
            {
                for(int k=0;k<m;k++)
                {
                    ar[k]=pre[j][k];
                }
                count+=find(ar,target);
            }
            else{
                for(int k=0;k<m;k++)
                {
                    ar[k]=pre[j][k]-pre[i-1][k];
                }
                count+=find(ar,target);
            }
        }
        }
            return count;
    }
        int find(int ar[],int target)
        {
            int count=0;
            HashMap<Integer,Integer> map=new HashMap<>();
            map.put(0,1);
            int sum=0;
            for(int i=0;i<ar.length;i++)
            {
                sum+=ar[i];
                int req=sum-target;
                if(map.containsKey(req))
                {
                 count+=map.get(req);   
                }
                map.put(sum,map.getOrDefault(sum,0)+1);
            }
            return count;
        }
}