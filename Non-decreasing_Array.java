class Solution {
  public boolean checkPossibility(int[] nums) {
        
        if( nums == null || nums.length <= 1 )
            return true;
        
        for( int i = 1; i < nums.length; i++ ) {
            
            if( nums[i] < nums[i-1] ) {
                int temp = nums[i];
                nums[i] = nums[i-1];
                boolean flag1 = check( nums );
            
                nums[i] = temp;
                nums[i-1] = temp;
                boolean flag2 = check( nums );
                
              return flag1 || flag2;      
            }
        }
        return true;
    }
    
    public boolean check(int[] nums) {
        for( int i = 1; i < nums.length ;i++)
            if( nums[i] < nums[i-1] )
                return false;
    return true;
    }
}
