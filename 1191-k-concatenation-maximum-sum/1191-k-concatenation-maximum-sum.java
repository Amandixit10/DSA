class Solution {
    int mod=1000000007;
    public int kConcatenationMaxSum(int[] arr, int k) {
         long preSum=Long.MIN_VALUE;     // max pre sum
        long suffSum=Long.MIN_VALUE;    //max suff sum
        
        
        
        // finding max subarray for k==1 using kadans algo
        int n=arr.length;
      long max=Long.MIN_VALUE;
        long Ksum=0;
        long total=0;
    for(int i=0;i<n;i++)
    {
    Ksum=Math.max(Ksum+(long)arr[i],arr[i]);
     max=Math.max(max,Ksum);
        total+=arr[i];
        preSum=Math.max(preSum,total);
    }
long sSum=0;
        for(int i=n-1;i>=0;i--)
        {
            sSum+=arr[i];
            suffSum=Math.max(suffSum,sSum);
        }
// case 1 will be max
// case 2 will be sufSum+preSum+k-2*total
       long ans=Long.MIN_VALUE;
if(k>1)
{
        ans=(long)(k-2)*total + preSum + suffSum;
       ans=Math.max(ans,preSum+suffSum);
}

ans=Math.max(ans,max);
        return (int)(Math.max(ans,0)%mod);
    }
}