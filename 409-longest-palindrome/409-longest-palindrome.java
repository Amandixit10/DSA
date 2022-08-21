class Solution {
    public int longestPalindrome(String s) {
        int ar[]=new int[256];
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            ar[ch]++;
        }
        int count=0;
        boolean check=false;
        for(int i:ar)
        {if(i%2!=0&&i>=1)
        {check=true;}
            count+=2*(i/2);}
        return check?count+1:count;
    }
}