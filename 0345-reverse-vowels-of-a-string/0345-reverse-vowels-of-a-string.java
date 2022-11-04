class Solution {
    public String reverseVowels(String s) {
        char ar[]=s.toCharArray();
        int n=s.length();
        int i=0;
        int j=n-1;
        HashSet<Character> set=new HashSet<>();
set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        while(i<j)
        {
            char a=s.charAt(i);
            char b=s.charAt(j);
            if(set.contains(a)&&set.contains(b))
            {
                char t=a;
                ar[i]=b;
                ar[j]=t;
                i++;
                j--;
            }
            else if(set.contains(a))
            {
                j--;
            }
            else if(set.contains(b))
            {
                i++;
            }
            else{
                i++;
                j--;
            }
            
        }
        StringBuilder str=new StringBuilder();
        for(char k:ar)
        {
            str.append(k);
        }
        return str.toString();
    }
}