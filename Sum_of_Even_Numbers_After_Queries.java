class Solution {
    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        
        int[] ans = new int[queries.length];
        
        int sum = 0, k = 0;
        for (int num : A) { 
            if (num%2 == 0) 
                sum += num;
        }
        
        for (int j=0; j<queries.length; j++) {
            
            int index = A[queries[j][1]];
            int val = queries[j][0];
            if (index%2 == 0) 
                sum -= index;
            A[queries[j][1]] += val;
            
            if (A[queries[j][1]]%2 ==0) 
                sum += A[queries[j][1]];
            ans[k++] = sum;
        }
        
        return ans;
    }
}
