class Solution {
    public int repeatedNTimes(int[] A) {
        
        int n = A.length;
        int ans = 0;
        int repeat = n/2 - 1;
        Arrays.sort(A);
        for(int i=1; i<n; i++) {
            if(A[i] == A[i-1])
                ans = A[i];
        }
        return ans;
    }
}
