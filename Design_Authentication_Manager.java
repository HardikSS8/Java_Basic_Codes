class AuthenticationManager {
    
    HashMap<String, Integer> map;
    Integer time_to_live;

    public AuthenticationManager(int timeToLive) {
        this.map = new HashMap<String, Integer>();
        this.time_to_live = timeToLive;
    }
    
    public void generate(String tokenId, int currentTime) {
        map.put(tokenId, currentTime);
    }
    
    public void renew(String tokenId, int currentTime) {
        
        if(!map.containsKey(tokenId))
            return;
        
        int generation_time = map.get(tokenId);
        int total_time = generation_time + time_to_live;
        
        if(currentTime < total_time) {
            map.put(tokenId, currentTime);
        }
    }
    
    public int countUnexpiredTokens(int currentTime) {
        int count = 0;
        for(String s : map.keySet()) {
            if(map.get(s) + time_to_live > currentTime)
                count++;
        }
        return count;
    }
}
