class Solution {
    public String reverseWords(String s) {
        String ans="";
        String ar[]=s.split(" ");
        int idx=0;
        for(String i:ar)
        {
          ans+=new StringBuilder(i).reverse();
            if(idx!=ar.length-1)
            {ans+=" ";}
            idx++;
        }
        return ans;
    }
}