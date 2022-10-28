class Solution {
    public boolean isPalindrome(int x) {
        if(x==0)
        {return true;}
        String s="";
        String t=Integer.toString(x);
        while(x>0)
        {
            s+=x%10;
            x/=10;
        }
        return s.equals(t);
    }
}