class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int i=0;
        int j=n-1;
        int max=0;
        while(i<j)
        {
            int volume=(j-i)*Math.min(height[i],height[j]);
          max=Math.max(max,volume);
            if(height[i]<=height[j])
            {
                i++;
            }
            else{
                j--;
            }
        }
        return max;
    }
}