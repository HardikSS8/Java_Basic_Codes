class Solution {
    public int[] arrayRankTransform(int[] arr) {
        
        int[] nums = arr.clone(); 
        Arrays.sort(nums);
        
        int[] rank = new int[arr.length]; 
        
        int r = 1;
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int n: nums)
            if(!map.containsKey(n))
                map.put(n, r++);
        
        for(int i=0; i<nums.length; i++)
            rank[i] = map.get(arr[i]);
        
        return rank;
    }
}
