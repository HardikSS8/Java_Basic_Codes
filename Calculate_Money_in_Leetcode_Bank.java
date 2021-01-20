class Solution {
    public int totalMoney(int n) {
        
        int mon = 1;
        int sum = 0;
        
        while(n > 0) {        
            for(int j = 0; j < 7 && n-- > 0; ++j)
                sum += mon + j;
            mon++;
        }
        return sum;
    }
}
