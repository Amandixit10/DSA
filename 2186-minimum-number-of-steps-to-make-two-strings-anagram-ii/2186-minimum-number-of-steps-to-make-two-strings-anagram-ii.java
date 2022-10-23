class Solution {
    public int minSteps(String s, String t) {
        int ar[]=new int[26];
        for(char ch:s.toCharArray())
        {
            ar[ch-'a']++;
        }
         for(char ch:t.toCharArray())
        {
            ar[ch-'a']--;
        }
        int cnt=0;
        for(int i:ar)
        {
            cnt+=Math.abs(i);
        }
        return cnt;
    }
}