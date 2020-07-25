class Solution {
    public String frequencySort(String s) {
        
        Map<Character, Integer> map = new HashMap<>();
        
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
        public int compare(Map.Entry<Character, Integer> a, 
                             Map.Entry<Character, Integer> b) {
            return b.getValue() - a.getValue();
        }});
                
        StringBuilder as = new StringBuilder();
        for (Map.Entry<Character, Integer> e: list) {
            int x = e.getValue();
            char c = e.getKey();
            for (int i = 0; i < x; i++) {
                as.append(c);
            }
        }
        return as.toString();
    }
}
