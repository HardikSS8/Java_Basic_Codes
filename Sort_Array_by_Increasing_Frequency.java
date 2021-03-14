class Solution {
    public int[] frequencySort(int[] nums) {
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        
        List<Map.Entry<Integer, Integer>> list = new ArrayList(map.entrySet());
        
        Collections.sort(list, (a,b) -> a.getValue() == b.getValue() ? b.getKey() - a.getKey() : a.getValue() - b.getValue());
        
        int j = 0;
        
        int[] ans = new int[nums.length];
        
        for (Map.Entry<Integer, Integer> entry : list)
            
            for (int i = 0; i < entry.getValue(); i++) 
                ans[j++] = entry.getKey();
        
        return ans;
    }
}
