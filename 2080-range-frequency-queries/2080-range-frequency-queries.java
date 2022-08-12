class RangeFreqQuery {
List<Integer>[] ids = new ArrayList[10001];
Function<Integer, Integer> lower_bound = (pos) -> pos < 0 ? ~pos : pos;
public RangeFreqQuery(int[] arr) {
    for (int i = 0; i < ids.length; ++i)
        ids[i] = new ArrayList<>();
    for (int i = 0; i < arr.length; ++i)
        ids[arr[i]].add(i);
}
public int query(int l, int r, int v) {
    return lower_bound.apply(Collections.binarySearch(ids[v], r + 1)) - lower_bound.apply(Collections.binarySearch(ids[v], l));
}
}

/**
 * Your RangeFreqQuery object will be instantiated and called as such:
 * RangeFreqQuery obj = new RangeFreqQuery(arr);
 * int param_1 = obj.query(left,right,value);
 */