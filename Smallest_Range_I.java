class Solution {
    public int smallestRangeI(int[] A, int K) {
        
        int min = A[0], max = A[0];
        
        for (int i=0; i<A.length; i++) {
            if(A[i] < min)
                min = A[i];
            if(A[i] > max)
                max = A[i];
        }
        
        if(max - min -2*K > 0)
            return max-min-2*K;
        else
            return 0;
    }
}
