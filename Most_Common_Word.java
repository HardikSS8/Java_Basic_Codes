class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        
        paragraph = paragraph.replaceAll("[^a-zA-Z0-9 ]", " ").toLowerCase();
        
        String[] words = paragraph.split("\\s+");
        
        Map<String,Integer> map = new HashMap<>();
        
        for(String s: words) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        
        for(String a: banned) {
            map.remove(a);
        }
                
        Map.Entry<String, Integer> maxEntry = null;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            
            if (maxEntry==null || entry.getValue().compareTo(maxEntry.getValue())>0)
                maxEntry = entry;
        }
        
        return maxEntry.getKey();
    }
}
