class Solution {
    public List<String> topKFrequent(String[] words, int k) {
            
        Map<String, Integer> map = new HashMap<>();
        
        for(String s : words) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        
        List<String> list = new ArrayList<>(map.keySet());
        
        Collections.sort(list, 
            (a1, a2) -> map.get(a1).equals(map.get(a2))
                        ? a1.compareTo(a2) : map.get(a2) - map.get(a1));
        
        return list.subList(0, k);
    }
}
