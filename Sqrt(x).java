class Solution {
    public int mySqrt(int x) {
        
        for(int i=0; i<=Math.sqrt(x); i++)
        {
            if(i == Math.floor(Math.sqrt(x)))
                return i;
        }
        return 0;
    }
}
