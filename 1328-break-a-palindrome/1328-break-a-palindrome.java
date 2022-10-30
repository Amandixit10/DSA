class Solution {
    public String breakPalindrome(String palindrome) {
        int n=palindrome.length();
        if(n==1)
        {return "";}
        int i=0;
        while(i<n/2)
        {
            if(palindrome.charAt(i)!='a')
            {
                return palindrome.substring(0,i)+"a"+palindrome.substring(i+1);
            }
            i++;
        }
        return n<2?"":palindrome.substring(0,n-1)+"b";
    }
}