class MyCalendar {
ArrayList<int[]> list;
    public MyCalendar() {
        list=new ArrayList<>();
    }
    
    public boolean book(int start, int end) {
        int f=0;
      for(int i=0;i<list.size();i++)
      {
      int s=list.get(i)[0];
          int e=list.get(i)[1];
          if(start>=e||s>=end)
          {continue;}
          f=1;
          break;
      }
        if(f==0)
        {
        list.add(new int[]{start,end});
        Collections.sort(list,(a,b)->(a[0]==b[0])?(a[1]-b[1]):(a[0]-b[0]));
        }
        return f==0;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */