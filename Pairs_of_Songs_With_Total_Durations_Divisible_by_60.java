class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        
        int count = 0;
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<time.length; i++) {
            
            int find = time[i] % 60;
            
            // System.out.println(map);
            // System.out.println(count);
            
            if(map.containsKey((60-find) % 60))
                count += map.get((60-find) % 60);
            
            map.put(find, map.getOrDefault(find, 0) + 1);
            
        }
        
        return count;
    }
}
