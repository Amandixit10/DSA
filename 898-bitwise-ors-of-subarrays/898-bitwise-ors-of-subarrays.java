class Solution {
    public int subarrayBitwiseORs(int[] arr) {
        HashSet<Integer> ans=new HashSet<>();
        HashSet<Integer> curr=new HashSet<>();
        for(int i:arr)
        {
            HashSet<Integer> curr2=new HashSet<>();
            curr2.add(i);
            for(int j:curr)
            {
                curr2.add(i|j);
            }
            curr=curr2;
            ans.addAll(curr);
        }
        return ans.size();
    }
}