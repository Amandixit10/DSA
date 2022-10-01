class LUPrefix {

    int len = 0;
    boolean isP[];
    public LUPrefix(int n) {
        isP = new boolean[n+1];
    }
    
    public void upload(int video) {
        isP[video] = true;
    }
    
    public int longest() {
        for(int i=len+1; i<isP.length; i++){
            if(isP[i] == false) break;
            len++;
        }
        return len;
    }
}