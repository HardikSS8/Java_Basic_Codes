class Solution {
    public int partitionDisjoint(int[] A) {
        
        int n = A.length;
        int[] min = new int[n];
        
        min[n - 1] = A[n - 1];
        
        for (int i = n - 2; i >= 1; i--)
            min[i] = Math.min(A[i], min[i + 1]);
        
        int max = -1;
        for (int i = 0; i < n - 1; i++) {
            max = Math.max(max, A[i]);
            if (max <= min[i + 1]) {
                return i + 1;
            }
        }
        return -1;
    }
}
