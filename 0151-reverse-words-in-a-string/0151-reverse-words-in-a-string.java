class Solution {
    public String reverseWords(String s) {
        String ar[]=s.split(" ");
        StringBuilder str=new StringBuilder();
        for(int i=ar.length-1;i>=0;i--)
        {
            if(ar[i].length()>0)
            {
            str.append(ar[i]);
                str.append(" ");
        }
        }
       String t= str.toString();
        return t.substring(0,t.length()-1);
    }
}