class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        
        Map<String, Integer> map = new HashMap<>();
        
        for(int i=0; i<list1.length; i++) {
            map.put(list1[i], i);
        }
        
        int min = Integer.MAX_VALUE;
                
        List<String> ans = new ArrayList<>();
        
        for(int i=0; i<list2.length; i++) {
            
            if(map.containsKey(list2[i])) {
                int sum = i + map.get(list2[i]);
                
                if(sum < min) {
                    
                    ans.clear();
                    min = sum;
                    ans.add(list2[i]);
                
                } else if(sum == min) {
                    ans.add(list2[i]);
                }
            }
        }
        System.out.println(ans);
        
        return ans.toArray(new String[ans.size()]);        
    }
}
