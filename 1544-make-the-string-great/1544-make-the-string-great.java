class Solution {
    public String makeGood(String s) {
        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray())
        {
            if(st.size()==0)
            {
                st.push(ch);
            }
            else{
                if(Math.abs(st.peek()-ch)==32)
                {
                    st.pop();
                }
                else{
                    st.push(ch);
                }
            }
        }
        StringBuilder str=new StringBuilder();
        while(st.size()>0)
        {
            str.append(st.pop());
        }
        return str.reverse().toString();
    }
}