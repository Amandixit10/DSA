class LUPrefix {
boolean is[];
    int len=0;
    public LUPrefix(int n) {
        is=new boolean[n+1];
    }
    
    public void upload(int video) {
       is[video]=true; 
    }
    
    public int longest() {
        for(int i=len+1;i<is.length;i++)
        {
            if(!is[i])
            {break;}
            len++;
        }
        return len;
    }
}

/**
 * Your LUPrefix object will be instantiated and called as such:
 * LUPrefix obj = new LUPrefix(n);
 * obj.upload(video);
 * int param_2 = obj.longest();
 */