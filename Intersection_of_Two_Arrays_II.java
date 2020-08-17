class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        
        
        for(int n: nums1) {
            map1.put(n, map1.getOrDefault(n,0) + 1);
        }
        
        int k = 0;
        for(int n : nums2) {
            int count = map1.getOrDefault(n,0);
            if(count > 0) {
                nums1[k++] = n;
                map1.put(n, count-1);
            }
        }
        
        return Arrays.copyOfRange(nums1, 0, k);
        
    }
}
