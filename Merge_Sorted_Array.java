class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        if(n == 0) return;
        
        int[] new1 = new int[m];
       
        for(int o=0; o<m; o++)
            new1[o] = nums1[o];
        
        int i = 0, j = 0, k = 0; 
        while (i<m && j<n) { 
            if (new1[i] < nums2[j]) 
                nums1[k++] = new1[i++]; 
            else
                nums1[k++] = nums2[j++]; 
        } 
        while (i < m) 
            nums1[k++] = new1[i++]; 
        while (j < n) 
            nums1[k++] = nums2[j++]; 

        for(int p=0; p<m+n; p++)
            System.out.printf("%d ", nums1[p]);
    }
}
