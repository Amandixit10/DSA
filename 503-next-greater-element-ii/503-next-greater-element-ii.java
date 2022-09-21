class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++)
        {
                while(st.size()>0&&nums[st.peek()]<nums[i])
                {
                   ans[st.pop()]=nums[i]; 
                }
            st.push(i);
        }
    int i=0;
        
        while(i<n&&st.size()>0)
        {
            int idx=st.peek();
            if(nums[i]>nums[idx])
            {
                ans[idx]=nums[i];
                st.pop();
            }
            else{
                i++;
            }
        }
        while(st.size()>0)
        {
            ans[st.pop()]=-1;
        }
        return ans;
    }
}