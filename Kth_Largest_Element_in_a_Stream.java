class KthLargest {

    PriorityQueue<Integer> minHeap;
    int K;

    public KthLargest(int k, int[] nums) {
        minHeap = new PriorityQueue<Integer>();
        this.K = k;
        
        for(int i=0; i<nums.length; i++) {
            minHeap.add(nums[i]);
            
            if(minHeap.size() > k) { 
                minHeap.remove();
            }
        }
    }
    
    public int add(int val) {
        minHeap.add(val);
        
        if(minHeap.size() > K) {
            minHeap.remove();
        }
        
        return minHeap.peek();
        
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
