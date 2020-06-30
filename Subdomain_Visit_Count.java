class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        
        Map<String, Integer> map = new HashMap<>();
        
        for (String domain: cpdomains) {
            
            String[] first = domain.split("\\s+");
            String[] second = first[1].split("\\.");
        
            int n = Integer.valueOf(first[0]);
            
            String cur = "";            
            for (int j = second.length - 1; j >= 0; --j) {
                cur = second[j] + (j < second.length - 1 ? "." : "") + cur;                
                map.put(cur, map.getOrDefault(cur, 0) + n);
            }
        }
        
        List<String> ans = new ArrayList();
        
        for (String dom: map.keySet())
            ans.add("" + map.get(dom) + " " + dom);
    
        return ans;
    }
}
