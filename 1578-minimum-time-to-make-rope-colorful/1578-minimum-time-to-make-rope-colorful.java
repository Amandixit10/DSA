class Solution {
    public int minCost(String colors, int[] neededTime) {
        int i=0;
        int j=0;
        int n=neededTime.length;
        int count=0;
        char ar[]=colors.toCharArray();
        int sum=0;
        int max=Integer.MIN_VALUE;
        while(j<n)
        {
            max=Integer.MIN_VALUE;
             sum=0;
            while(j<n&&ar[i]==ar[j])
            {
             sum+=neededTime[j];
                max=Math.max(max,neededTime[j]);
                j++;
            }
            count+=sum-max;
            //System.out.println(count+" "+max);
            i=j;
        }
        return count;
    }
}