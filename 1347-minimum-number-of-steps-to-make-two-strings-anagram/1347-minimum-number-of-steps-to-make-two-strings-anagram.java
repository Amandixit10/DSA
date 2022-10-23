class Solution {
    public int minSteps(String s, String t) {
        int cnt=0;
        int ar[]=new int[26];
        for(char ch:s.toCharArray())
        {
            ar[ch-'a']++;
        }
         for(char ch:t.toCharArray())
        {
            ar[ch-'a']--;
        }
        for(int i:ar)
        {
            if(i>=0)
            {cnt+=i;}
        }
        return cnt;
    }
}