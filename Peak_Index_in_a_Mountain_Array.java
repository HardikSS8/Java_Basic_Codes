class Solution {
    public int peakIndexInMountainArray(int[] A) {
        if(A == null && A.length == 0)
            return 0;
        
        int n = A.length;
        int i = 1;
        while(i < n-1) {
            if(A[i] > A[i-1] && A[i+1] < A[i])
                return i;
            i++;
        }
        return 0;
    }
}
