class Solution {
    public int totalSteps(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n];
        int max=0;
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--)
        {
while(st.size()>0 && nums[i]>nums[st.peek()])
{
   dp[i]=Math.max(dp[i]+1,dp[st.peek()]);
    st.pop();
}
            max=Math.max(max,dp[i]);
            st.push(i);
        }
        return max;
    }
}