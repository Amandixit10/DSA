class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
     StringBuilder s=new StringBuilder();
        StringBuilder t=new StringBuilder();
        for(String i:word1)
        {
            s.append(i);
        }
        for(String i:word2)
        {
            t.append(i);
        }
        return s.compareTo(t)==0;
    }
}