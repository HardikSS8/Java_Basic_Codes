class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        
        int ans = 0;
        int len1 = arr1.length;
        int len2 = arr2.length;
                
        for(int i=0; i<len1; i++) {
            int count = 0;
            for(int j=0; j<len2; j++) {
                if(Math.abs(arr1[i]-arr2[j]) <= d)
                    count++;
            }
            if(count == 0)
                ans++;
        }
        return ans;
    }
}
