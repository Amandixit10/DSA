class Solution {
    public String breakPalindrome(String palindrome) {
        TreeSet<String> set=new TreeSet<>();
        int n=palindrome.length();
        if(n==1)
        {return "";}
        for(int i=0;i<n;i++)
        {
            if(i==(n/2)&&n%2!=0)
            {continue;}
            String str=palindrome.charAt(i)=='a'?"b":"a";
    String s=palindrome.substring(0,i)+str+palindrome.substring(i+1,n);
            set.add(s);
        }
        return set.first();
    }
}