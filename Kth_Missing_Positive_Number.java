class Solution {
    public int findKthPositive(int[] arr, int k) {
                
        int count=0;
        
        Set<Integer> set = new HashSet<>();
        
        for(int n : arr)
            set.add(n);
        
        int start = 1;
        while(k > 0) {
            if(!set.contains(start))
                k--;
            start++;        
        }
        return --start;
    }
}
