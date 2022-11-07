class Solution {
    public int maximum69Number (int num) {
     String s=Integer.toString(num);
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='6')
            {
                return Integer.parseInt(s.substring(0,i)+"9"+s.substring(i+1,s.length())); 
            }
        }
        return Integer.parseInt(s);
    }
}