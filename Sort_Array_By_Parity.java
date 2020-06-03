class Solution {
    public int[] sortArrayByParity(int[] A) {
        
        int n = A.length;
        
        int[] ans = new int[n];
        int count=0;
        for(int i=0; i<n; i++) {
            if(A[i] %2 == 0) {
                ans[count] = A[i];
                count++;
            }
        }
        for(int j=0; j<n; j++) {
            if(A[j] % 2 != 0) {
                ans[count] = A[j];
                count++;
            }
        }
        return ans;
    }
}
