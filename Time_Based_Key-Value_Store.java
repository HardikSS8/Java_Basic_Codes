class TimeMap {

    Map<String, List<Pair<Integer, String>>> map;
    
    /** Initialize your data structure here. */
    public TimeMap() {
        this.map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        
        if(!map.containsKey(key)) {
            map.put(key, new ArrayList<Pair<Integer, String>>());
        }
        
        map.get(key).add(new Pair(timestamp, value));
    }
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key)) 
            return "";
        
        List<Pair<Integer, String>> pair = map.get(key);
        
        int i = Collections.binarySearch(pair, new Pair<Integer, String>(timestamp, "{"), (a, b) -> Integer.compare(a.getKey(), b.getKey()));
        
        if (i >= 0)
            return pair.get(i).getValue();
        else if (i == -1)
            return "";
        else
            return pair.get(-i-2).getValue();
    }
}
