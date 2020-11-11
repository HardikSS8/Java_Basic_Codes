class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i : arr) {
            if (map.containsKey(i)) {
                int val = map.get(i) + 1;
                map.put(i, val);
            }
            else
                map.put(i, 1);
        }
        
        List<Integer> counts = new ArrayList<>(map.values());
        
        Collections.sort(counts);
        
        System.out.println(counts);
        
        int removed = 0;
        for (int i = 0; i < counts.size(); i++) {
            int val = counts.get(i);
            k = k - val;
            if (k >= 0)
                removed++;
            else break;
        }
        return counts.size() - removed;
    }
}
