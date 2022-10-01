class Solution {
    public boolean equalFrequency(String word) {
        int ar[]=new int[26];
        for(int i=0;i<word.length();i++)
        {
            ar[word.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++)
        {
         if(ar[i]!=0)
         {
             ar[i]-=1;
             HashSet<Integer> set=new HashSet<>();
             for(int j=0;j<26;j++)
             {
                 if(ar[j]!=0)
                 {
                 set.add(ar[j]);
                 }
             }
if(set.size()<=1)
{
    return true;
}
             ar[i]+=1;
         }
        }
        return false;
    }
}