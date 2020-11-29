class Solution {
    
    public int findSum(int[] arr) {
        
        int sum = 0;
        for(int i=0; i<arr.length; i++) 
            sum += arr[i];
        return sum;
    }
    
    public int maximumWealth(int[][] accounts) {
        
        int max = 0;
        
        for(int i=0; i<accounts.length; i++) {            
            if(findSum(accounts[i]) > max)
                max = findSum(accounts[i]);
        }
        
        
        return max;
    }
}
