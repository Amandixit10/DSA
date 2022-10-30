class Solution {
    public String breakPalindrome(String palindrome) {
        TreeSet<String> set=new TreeSet<>();
        int n=palindrome.length();
        if(n==1)
        {return "";}
        for(int i=0;i<n;i++)
        {
            String str=palindrome.charAt(i)=='a'?"b":"a";
    String s=palindrome.substring(0,i)+str+palindrome.substring(i+1,n);
            if(!ispalin(s))
            {
            set.add(s);
            }
        }
        return set.first();
    }
    boolean ispalin(String s)
    {
        int i=0;
        int j=s.length()-1;
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {return false;}
            i++;
            j--;
        }
        return true;
    }
}