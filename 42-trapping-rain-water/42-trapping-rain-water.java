class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int pre[]=new int[n];
        int suf[]=new int[n];
        pre[0]=height[0];
        suf[n-1]=height[n-1];
        for(int i=1;i<n;i++)
        {
            pre[i]=Math.max(pre[i-1],height[i]);
        }
        for(int i=n-2;i>=0;i--)
        {
            suf[i]=Math.max(suf[i+1],height[i]);
        }
        int count=0;
        for(int i=0;i<n;i++)
        {
        count+=Math.min(pre[i],suf[i])-height[i];
        }
        return count;
    }
}