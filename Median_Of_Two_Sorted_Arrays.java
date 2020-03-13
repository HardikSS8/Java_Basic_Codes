class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        double ans;
        int m = nums1.length;
        int n = nums2.length;
        double[] arr = new double[m+n];
        
        int k = 0;
        for(int i=0; i<m; i++) {
            arr[k] = nums1[i];
            k++;
        }
        for(int j=0; j<n; j++) {
            arr[k] = nums2[j];
            k++;
        }
        
        Arrays.sort(arr);
        
        if((m+n) %2 != 0) {
            ans = arr[(m+n)/2];
        } else {
            ans = (arr[(m+n)/2] + arr[((m+n)/2)-1]) / 2;
        }
        return ans;
    }
}
