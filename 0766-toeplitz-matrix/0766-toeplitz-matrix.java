class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                int val=i-j;
                if(map.containsKey(val))
                {
                    if(map.get(val)!=matrix[i][j])
                    {return false;}
                }
                else{
                    map.put(val,matrix[i][j]);
                }
            }
        }
        return true;
    }
}