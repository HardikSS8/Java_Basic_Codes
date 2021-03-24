class Solution {
    public String[] getFolderNames(String[] names) {
        
        String[] ans = new String[names.length];
        
        Map<String, Integer> map = new HashMap<>();
        int j = 0;
        int i = 1;
        for(String s : names) {
            
            if(!map.containsKey(s)) {
                map.put(s, 1);
                ans[j] = s;
            } else {
                
                int val = map.get(s);
                String str = s + "(" + val + ")";
                
                while(map.containsKey(str)) {
                    str = s + "(" + ++val + ")";
                }
                ans[j] = str;
                map.put(s, ++val);
                map.put(str, 1);
            } 
            j++;
        }
        
        return ans;
    }
}
