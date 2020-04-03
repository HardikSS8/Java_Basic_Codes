class Solution {
    public List<Integer> addToArrayForm(int[] A, int K) {
        
        List<Integer> ans = new ArrayList<Integer>();
        int j = A.length;
        while(--j >= 0 || K > 0) {
            if(j >= 0)
                K += A[j];
            ans.add(K%10);
            K /= 10;
        }
        Collections.reverse(ans);
        return ans;
    }
}
