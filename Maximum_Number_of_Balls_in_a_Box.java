class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        
        int[] count = new int[50];
        
        int ans = Integer.MIN_VALUE;
        
        for(int i = lowLimit; i <= highLimit; i++) {
            
            int digit_sum = 0;
            int currBallNo = i;
            
            while(currBallNo > 0) {
                digit_sum += currBallNo % 10;
                currBallNo /= 10;
            }
            
            count[digit_sum]++;
            ans = Math.max(ans, count[digit_sum]);
        }
    
        
        return ans;
    }
}
