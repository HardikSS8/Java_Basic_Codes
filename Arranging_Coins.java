class Solution {
    
    int sum = 0;
    
    public int arrangeCoins(int n) {

        sum += 1;
        if(sum > n)
            return sum-1;
        else        
            return arrangeCoins(n-sum);
    }
}
