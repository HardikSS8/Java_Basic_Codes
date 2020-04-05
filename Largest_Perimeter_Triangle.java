class Solution {
    public int largestPerimeter(int[] A) {
        if(A == null || A.length < 3)
            return 0;
        
        int n = A.length;
        Arrays.sort(A);
        for(int i=n-3; i>=0; i--) {
            if(A[i] + A[i+1] > A[i+2]) {
                return A[i] + A[i+1] + A[i+2];
            }
        }
        return 0;
    }
}
//             if(A == null || A.length < 3)
//                 return 0;
//             int max = 0;
//             int n = A.length;
//             for(int j=i+1; j<n && j!=i; j++) {
//                 for(int k=j+1; k<n && k!=i && k!=j; k++) {
//                     int ans = 0;
//                     if(A[i] + A[j] > A[k] && A[i] + A[k] > A[j] && A[j] + A[k] > A[i]) {
//                         ans = A[i] + A[j] + A[k];
//                     }
//                     if(ans > max)
//                         max = ans;
//                 }
//             }   
//         }
//         return max;
//     }
// }
