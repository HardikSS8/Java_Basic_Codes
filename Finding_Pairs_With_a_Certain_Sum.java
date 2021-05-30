class FindSumPairs {
    int [] nums1;
    int [] nums2;
    Map<Integer,Integer> map = new HashMap<>(); 
    
    public FindSumPairs(int[] num1, int[] num2) {
         
       this.nums1 = num1;
       this.nums2 = num2;
        
        for(int val : nums2) {            
            int freq = map.getOrDefault(val,0);
            map.put(val,freq + 1);
        }
        // System.out.println(map);
    }
    
    public void add(int index, int val) {
        map.put(nums2[index], map.get(nums2[index]) - 1); 
        
        nums2[index] += val; 
        
        map.put(nums2[index], map.getOrDefault(nums2[index],0) + 1); 
        // System.out.println(map);
    }
    
    public int count(int tot) {
        
        int count = 0;
        
        for(int i = 0;i<nums1.length;i++){
            int temp = tot - nums1[i]; 
            count += map.getOrDefault(temp,0); 
        }
        // System.out.println(map);    
        return count;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */
