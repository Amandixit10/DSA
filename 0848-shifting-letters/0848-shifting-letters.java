class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        int sum=0;
        char ar[]=s.toCharArray();
        for(int i=s.length()-1;i>=0;i--)
        {
            sum=(sum+shifts[i])%26;
        ar[i]=(char)((((s.charAt(i)-'a')+sum)%26)+'a');
        }
        StringBuilder str=new StringBuilder();
        for(char ch:ar)
        {
            str.append(ch);
        }
        return str.toString();
    }
}