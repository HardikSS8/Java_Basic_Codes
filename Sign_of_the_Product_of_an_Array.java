class Solution {
    public int arraySign(int[] nums) {
        
        int num_neg = 0;
        
        for(int n : nums) {
            if(n < 0) 
                num_neg++;
            else if(n == 0)
                return 0;
        }
        
        if(num_neg % 2 == 0) return 1;
        else return -1;
    }
}
