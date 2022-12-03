class Solution {
    public boolean closeStrings(String word1, String word2) {
        int n=word1.length();
        int m=word2.length();
        HashSet<Character> set=new HashSet<>();
        if(n!=m)
        {return false;}
        int a[]=new int[26];
        int b[]=new int[26];
        for(char i:word1.toCharArray())
        {
            a[i-'a']++;
            set.add(i);
        }
         for(char i:word2.toCharArray())
        {
             b[i-'a']++;
            if(!set.contains(i))
            {return false;}
        }
        Arrays.sort(a);
        Arrays.sort(b);
    for(int i=0;i<26;i++)
    {
        if(a[i]!=b[i])
        {return false;}
    }
        return true;
    }
}