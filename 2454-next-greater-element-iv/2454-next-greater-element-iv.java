class Solution {
    public int[] secondGreaterElement(int[] nums) {
        int n=nums.length;
    int ans[]=new int[n];
        Stack<Integer> st=new Stack<>();
       PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->(nums[a]-nums[b]));
        for(int i=0;i<n;i++)
        {
            while(pq.size()>0&&nums[pq.peek()]<nums[i])
            {
             ans[pq.remove()]=nums[i];   
            }
            while(st.size()>0&&nums[st.peek()]<nums[i])
            {
                pq.add(st.pop());
            }
            st.push(i);
        }
        while(st.size()>0)
        {
            ans[st.pop()]=-1;
        }
         while(pq.size()>0)
        {
            ans[pq.remove()]=-1;
        }
        
        return ans;
    }
}