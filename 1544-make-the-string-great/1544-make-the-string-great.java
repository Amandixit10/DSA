class Solution {
    public String makeGood(String s) {
        if(s.length()==1)
        {return s;}
        String t=makeGood(s.substring(1));
        if(t.length()>0&&Math.abs(s.charAt(0)-t.charAt(0))==32)
        {
            return t.substring(1);
        }
        return (s.charAt(0)+"")+t;
    }
}