class Solution {
    
    public int rev(int n) {
        
        int temp = 0;
        
        while(n > 0) {
            temp = temp*10 + n % 10;
            n = n / 10;
        }
        return temp;
    }
    
    public int countNicePairs(int[] nums) {

        int count = 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++) {
            // System.out.println(rev(nums[i]));
            nums[i] = nums[i] - rev(nums[i]);
            if(map.containsKey(nums[i])) {
                count = (count + map.get(nums[i])) % 1000000007;
            }
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        
        // System.out.println(Arrays.toString(nums));
        // System.out.println(map);
        
        return count;
    }
}
